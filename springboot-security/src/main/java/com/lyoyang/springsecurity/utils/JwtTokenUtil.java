package com.lyoyang.springsecurity.utils;

import com.lyoyang.springsecurity.entity.Manager;
import io.jsonwebtoken.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;
import java.util.List;

/**
 * 使用 java-jwt jwt类库
 * 
 * @author caobotao
 * @create 2019/6/18
 */
@Component
@Slf4j
public class JwtTokenUtil {

    @Value("${app.jwtSecret}")
    private String jwtSecret;

    @Value("${app.jwtExpirationInMs}")
    private int jwtExpirationInMs;

    private static final String AUTHORITY = "authority";

    private static final SignatureAlgorithm SIGN_TYPE = SignatureAlgorithm.HS256;

    /**
     * claims 为自定义的私有声明, 要放在前面
     * <p>
     * 生成token
     */
    public String generateToken(Authentication authentication) {
        Manager userPrincipal = (Manager) authentication.getPrincipal();
        long instantNow = Instant.now().toEpochMilli();
        Claims claims = Jwts.claims();
        claims.put(Claims.SUBJECT, userPrincipal.getUsername());
        claims.put(Claims.AUDIENCE, userPrincipal.getUsername());
        claims.put(AUTHORITY, userPrincipal.getAuthorities());
        return Jwts.builder().setClaims(claims).setIssuedAt(new Date(instantNow))
            .setExpiration(new Date(instantNow + jwtExpirationInMs)).signWith(SIGN_TYPE, jwtSecret).compact();
    }

    /**
     * 将token解析, 映射为 UserDetails
     * 
     * @param jwtToken
     * @return
     */
    public Manager getUserDetailsFromToken(String jwtToken) {
        Claims claimsFromToken = getClaimsFromToken(jwtToken);
        String userName = claimsFromToken.get(Claims.SUBJECT, String.class);
        List list = claimsFromToken.get(AUTHORITY, List.class);
        Manager simpleUserDetail = new Manager();
        simpleUserDetail.setUsername(userName);
        simpleUserDetail.setAuthorities(list);
        return simpleUserDetail;
    }

    public boolean validateToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
            return true;
        } catch (SignatureException ex) {
            log.error("Invalid JWT signature");
        } catch (MalformedJwtException ex) {
            log.error("Invalid JWT token");
        } catch (ExpiredJwtException ex) {
            log.error("Expired JWT token");
        } catch (UnsupportedJwtException ex) {
            log.error("Unsupported JWT token");
        } catch (IllegalArgumentException ex) {
            log.error("JWT claims string is empty.");
        }
        return false;
    }

    /**
     * 刷新令牌
     *
     * @param token 原令牌
     * @return 新令牌
     */
    public String refreshToken(String token) {
        String refreshedToken;
        try {
            Claims claims = getClaimsFromToken(token);
            long instantNow = Instant.now().toEpochMilli();
            refreshedToken = Jwts.builder().setClaims(claims).setIssuedAt(new Date(instantNow))
                .setExpiration(new Date(instantNow + jwtExpirationInMs)).signWith(SIGN_TYPE, jwtSecret).compact();
        } catch (Exception e) {
            refreshedToken = null;
        }
        return refreshedToken;
    }

    /**
     * 获取token是否过期
     */
    public Boolean isTokenExpired(String token) {
        Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    /**
     * 根据token获取username
     */
    public String getUserNameFromToken(String token) {
        return getClaimsFromToken(token).getSubject();
    }

    /**
     * 获取token的过期时间
     */
    public Date getExpirationDateFromToken(String token) {
        return getClaimsFromToken(token).getExpiration();
    }

    /**
     * 解析JWT
     */
    private Claims getClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(token).getBody();
    }
}

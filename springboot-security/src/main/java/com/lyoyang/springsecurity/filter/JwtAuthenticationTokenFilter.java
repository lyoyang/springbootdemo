package com.lyoyang.springsecurity.filter;

import com.alibaba.fastjson.JSONObject;
import com.lyoyang.springsecurity.constant.Constant;
import com.lyoyang.springsecurity.dto.UserDetailsResponseDto;
import com.lyoyang.springsecurity.entity.Manager;
import com.lyoyang.springsecurity.service.CommonService;
import com.lyoyang.springsecurity.utils.JwtTokenUtil;
import com.lyoyang.springsecurity.utils.ThreadLocalUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author: Brian
 * @Date: 2020/5/14 16:51
 * @Description:
 */
@Slf4j
@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
    private static final String BASE_LOG = "JwtAuthenticationTokenFilter";


    @Value("${user.token.prefix}")
    private String tokenPrefix;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Resource
    private CommonService commonService;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        String token = request.getHeader(Constant.HEADER_STRING);
        String storeToken = (String) request.getSession().getAttribute(tokenPrefix);
        if (StringUtils.hasText(token) && StringUtils.hasText(storeToken) && jwtTokenUtil.validateToken(token)) {
            Manager userDetails = jwtTokenUtil.getUserDetailsFromToken(token);
            log.info(BASE_LOG + ".doFilterInternal:jwt过滤器效验token请求:{},解析结果:{}", token,
                    JSONObject.toJSONString(userDetails));
            Optional<UserDetailsResponseDto> currentUserDetails = commonService.getCurrentUserDetails(false, userDetails.getUsername());
            if (userDetails.getUsername() != null && SecurityContextHolder.getContext().getAuthentication() == null) {
                List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
                if (currentUserDetails.isPresent()) {
                    List<String> roleResponseDtos = currentUserDetails.get().getRoleIds();
                    if(CollectionUtils.isNotEmpty(roleResponseDtos)){
                        roleResponseDtos.forEach(roleId -> grantedAuthorities
                                .add(new SimpleGrantedAuthority(roleId)));
                    }
                    UsernamePasswordAuthenticationToken authentication =
                            new UsernamePasswordAuthenticationToken(userDetails, null, grantedAuthorities);
                    authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                    SecurityContextHolder.getContext().setAuthentication(authentication);
                }
            } else {
                currentUserDetails.ifPresent(ThreadLocalUtil::setCurrentUserDetails);
            }
        }
        filterChain.doFilter(request, response);
    }
}

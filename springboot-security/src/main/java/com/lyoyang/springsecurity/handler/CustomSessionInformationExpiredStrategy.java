package com.lyoyang.springsecurity.handler;

import com.alibaba.fastjson.JSONObject;
import com.lyoyang.springsecurity.dto.MvcResponseDto;
import com.lyoyang.springsecurity.enums.ResponseEnum;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.session.SessionInformationExpiredEvent;
import org.springframework.security.web.session.SessionInformationExpiredStrategy;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author: Brian
 * @Date: 2020/5/15 15:02
 * @Description:
 */
@Component
public class CustomSessionInformationExpiredStrategy implements SessionInformationExpiredStrategy {

    @Override
    public void onExpiredSessionDetected(SessionInformationExpiredEvent event) throws IOException, ServletException {
        HttpServletResponse response = event.getResponse();
        MvcResponseDto<Object> build = MvcResponseDto.builder().code(ResponseEnum.SESSION_EXPIRED.getCode()).message(ResponseEnum.SESSION_EXPIRED.getMessage()).build();
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        response.setCharacterEncoding(StandardCharsets.UTF_8.name());
        response.getWriter().write(JSONObject.toJSONString(build));
    }
}

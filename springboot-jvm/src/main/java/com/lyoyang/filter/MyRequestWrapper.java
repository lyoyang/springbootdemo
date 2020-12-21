package com.lyoyang.filter;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class MyRequestWrapper extends HttpServletRequestWrapper {

    private String body;
    private String requestMethod;

    private boolean useWrapper;

    public MyRequestWrapper(HttpServletRequest request) throws IOException {
        super(request);
        requestMethod = request.getMethod();
        if (MediaType.APPLICATION_JSON_VALUE.equals(request.getContentType())) {
            StringBuilder sb = new StringBuilder();
            String line = null;
            BufferedReader reader = request.getReader();
            while((line = reader.readLine()) != null) {
                sb.append(line);
            }
            body = sb.toString();
            useWrapper = true;
        }
    }


    @Override
    public String getQueryString() {
        if(useWrapper) {
            return body;
        } else {
             return JSONObject.toJSONString(super.getParameterMap());
        }
    }



    @Override
     public ServletInputStream getInputStream() throws IOException {
      ByteArrayInputStream bais = new ByteArrayInputStream(body.getBytes());
       return new ServletInputStream() {
            @Override
            public int read() throws IOException {
                return bais.read();
            }

            @Override
            public boolean isFinished() {
                    return bais.available()==0;
            }

            @Override
            public boolean isReady() {
                      return true;
            }

             @Override
             public void setReadListener(ReadListener listener) {}
        };
    }


}



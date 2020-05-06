package com.lyoyang.springsecurity.controller;

import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.session.FindByIndexNameSessionRepository;
import org.springframework.session.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;

@Controller
public class CaptchaController {

    @Autowired
    private Producer captchaProducer;



    @RequestMapping("/captcha.jpg")
    public void getCaptcha(HttpServletRequest request, HttpServletResponse response, HttpSession httpSession) throws IOException {
        response.setContentType("image/jpeg");
        String text = captchaProducer.createText();
        httpSession.setAttribute(httpSession.getId(), text);
//        request.getSession().setAttribute("captcha", text);
        BufferedImage image = captchaProducer.createImage(text);
        ServletOutputStream outputStream = response.getOutputStream();
        ImageIO.write(image, "jpg", outputStream);
        try {
            outputStream.flush();
        } finally {
            outputStream.close();
        }
    }

}

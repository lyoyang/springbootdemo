package com.lyoyang.springsecurity.Controller;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.ArrayList;

@RestController
public class IndexController {


//    @RequestMapping("/")
//    public String index() {
//        return "redirect:/home";
//    }

    @RequestMapping("/home")
    public String home(Principal principal) {
        return "hello," + principal.getName();
    }




//    @RequestMapping("/user")
//    public String userView() {
//        return "userInfo";
//    }
//
//
//    @RequestMapping("/admin")
//    public String showAdmin() {
//        return "showAdmin";
//    }



    @RequestMapping("/register")
    public String register(String username, String password, Model model) {
//        if(username == null || password == null) {
//            return "register";
//        }
//        User user = new User();
//        user.setUsername(username);
//        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
//        password = encoder.encode(password);
//        user.setPassword(password);
//        Role role = new Role();
//        role.setId(1L);
//        ArrayList<Role> roles = Lists.newArrayList();
//        roles.add(role);
//        user.setRoles(roles);
//        Long res = userService.saveUser(user);
//        return "login";
        return "";
    }



    @GetMapping("/loginError")
    public String loginError(Model model) {
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","用户名或密码错误");
        return "login";
    }
}

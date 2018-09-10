package com.lyoyang.springbootsecurityjpa.Controller;

import com.google.common.collect.Lists;
import com.lyoyang.springbootsecurityjpa.Service.UserService;
import com.lyoyang.springbootsecurityjpa.entity.Role;
import com.lyoyang.springbootsecurityjpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class IndexController {


    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "redirect:/home";
    }

    @RequestMapping("/home")
    public String home() {
        return "home";
    }

    /**
     * 登录的时候不会走这个路由，会走Security自定义的路由
     * @return
     */
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/user")
    public String userView() {
        return "userInfo";
    }


    @RequestMapping("/admin")
    public String showAdmin() {
        return "showAdmin";
    }



    @RequestMapping("/register")
    public String register(String username, String password, Model model) {
        if(username == null || password == null) {
            return "register";
        }
        User user = new User();
        user.setUsername(username);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        password = encoder.encode(password);
        user.setPassword(password);
        Role role = new Role();
        role.setId(1L);
        ArrayList<Role> roles = Lists.newArrayList();
        roles.add(role);
        user.setRoles(roles);
        Long res = userService.saveUser(user);
        return "login";
    }



    @GetMapping("/loginError")
    public String loginError(Model model) {
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","用户名或密码错误");
        return "login";
    }
}

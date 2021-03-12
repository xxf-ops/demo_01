package com.example.demo.function;

import com.example.demo.entity.user.admin;
import com.example.demo.service.manager.Service.MService;
import com.example.demo.service.user.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class Login {
    @Autowired
    private UserService userService;
    @Resource
    MService service;
    @RequestMapping("/login")
    public String login(HttpServletRequest request, admin admin){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (userService){
            return "register";
        }else if (){
            return "index";
        }else{
            return "redirect:/login.html";
        }
    }
    @RequestMapping("/register")
    public String SignUp(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String realname = request.getParameter("realName");
        String Iphone = request.getParameter("Iphone");
        String Address = request.getParameter("address");
        admin admin = new admin();
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setRealname(realname);
        admin.setIphone(Iphone);
        admin.setAddress(Address);
        service.;
    }
}

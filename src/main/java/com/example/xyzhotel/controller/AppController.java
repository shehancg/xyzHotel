package com.example.xyzhotel.controller;

import com.example.xyzhotel.model.UserObj;
import com.example.xyzhotel.model.execption.ExistingEmailExecption;
import com.example.xyzhotel.model.execption.InvalidUserExecption;
import com.example.xyzhotel.model.responsehandle.Response;
import com.example.xyzhotel.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AppController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String viewHomePage(){
        return "index";
    }

    @GetMapping("/register")
    public String showRegister(){
        return "register";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/users")
    public String showUsers(){
        return "allusers";
    }

}


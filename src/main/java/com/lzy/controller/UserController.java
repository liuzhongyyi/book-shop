package com.lzy.controller;

import com.lzy.dao.Userdao;
import com.lzy.domain.Users;
import com.lzy.exception.LoginFail;
import com.lzy.exception.RepeatRegister;
import com.lzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {
    @Autowired
   private UserService userService;


    @PostMapping("/login")
    public String login(String username, String password, HttpServletRequest request){
        Users user = userService.login(username, password);


        if(user==null)
        {
            throw new LoginFail("账号或者密码错误");
        }else {
            request.getSession().setAttribute("username",user.getUsername());
            return  "redirect:index.jsp";
        }

    }

    @PostMapping("/register")
    public String register(Users users){
        String username = users.getUsername();
        Users user = userService.findUserByName(username);
        if(user!=null){
            throw new RepeatRegister("重复注册");
        }
        int n= userService.register(users);
        if(n>0){
            return "login";
        }else {
            throw new RepeatRegister("注册失败");
        }

    }

    @GetMapping("/getLogin")
    public String getLogin(){
        return "login";
    }

    @GetMapping("/getReg")
    public String getReg(){
        return "register";
    }
}

package com.lzy.exceptionHandler;

import com.lzy.exception.LoginFail;

import com.lzy.exception.RepeatRegister;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class loginFailHandler {

    @ExceptionHandler(LoginFail.class)
    public ModelAndView handleLoginException(Exception ex){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");
        modelAndView.getModel().put("errorMessage",ex.getMessage());
        return modelAndView;
    }

    @ExceptionHandler(RepeatRegister.class)
    public ModelAndView handleRegisterException(Exception ex){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("register");
        modelAndView.getModel().put("errorMessage",ex.getMessage());
        return modelAndView;
    }
}

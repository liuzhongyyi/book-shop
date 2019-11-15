package com.lzy.controller;

import com.lzy.domain.Orderinfo;
import com.lzy.service.OrderService;
import com.lzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.Column;
import javax.servlet.http.HttpSession;

@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;
    @RequestMapping("/goTopayment")
    public ModelAndView goTopayment(HttpSession session){
       Integer userId = (Integer) session.getAttribute("userId");
        Orderinfo orderInfo = orderService.getOrderInfo(userId);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("payment");
        modelAndView.getModel().put("orderInfo",orderInfo);
        return modelAndView;
    }
}

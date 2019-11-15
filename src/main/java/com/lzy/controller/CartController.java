package com.lzy.controller;

import com.lzy.domain.Cart;
import com.lzy.domain.Result;
import com.lzy.service.CartService;
import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class CartController {

    @Autowired
    private CartService cartService;
    @RequestMapping("/addToCart")
    public String addToCart(Integer bookId,HttpSession session){
        Integer userId = (Integer) session.getAttribute("userId");
        cartService.saveCart(1,bookId,userId);
        return "redirect:getShopCart";


    }

    @RequestMapping("/getShopCart")
    public ModelAndView getShopCart(HttpSession session){
        ModelAndView modelAndView = new ModelAndView();
        Integer userId = (Integer) session.getAttribute("userId");
        List<Cart> cart = cartService.getCart(userId);
        System.out.println(cart);
        modelAndView.setViewName("cart");
        modelAndView.getModel().put("cart",cart);
        return modelAndView;
    }
    @ResponseBody
    @RequestMapping("/addNum")
    public Result addNum(Integer num, Integer bookId, HttpSession session, ServletRequest request){

        Integer userId = (Integer) session.getAttribute("userId");
        Result result = cartService.updateCart(num, bookId, userId);
        return result;

    }
}

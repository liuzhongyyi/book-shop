package com.lzy.service.impl;

import com.lzy.dao.CartDao;
import com.lzy.dao.OrderDao;
import com.lzy.domain.Cart;
import com.lzy.domain.Orderinfo;
import com.lzy.service.CartService;
import com.lzy.service.OrderService;
import com.sun.tools.internal.xjc.model.CArrayInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private CartService cartService;
    @Autowired
    private OrderDao orderDao;
    @Override
    public Orderinfo getOrderInfo(Integer userId) {
        Integer allPrice=0;
        Orderinfo orderinfo = new Orderinfo();
        List<Cart> carts = cartService.getCart(userId);
        orderinfo.setCreateTime(new Date().toString());
        orderinfo.setUserId(userId);
        for (Cart cart : carts) {
            allPrice += cart.getBook().getBookPrice() * cart.getBookQuantity();
        }
        orderinfo.setTotal(allPrice);
        orderinfo.setOrderState(1);
        return orderDao.save(orderinfo);
    }
}

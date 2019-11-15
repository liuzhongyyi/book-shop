package com.lzy.service;

import com.lzy.domain.Cart;
import com.lzy.domain.Result;

import java.util.List;

public interface CartService {

    public List<Cart> getCart(Integer userId);
    public Result updateCart(Integer num, Integer bookId, Integer userId);
    public void  saveCart(Integer num, Integer bookId, Integer userId);
}

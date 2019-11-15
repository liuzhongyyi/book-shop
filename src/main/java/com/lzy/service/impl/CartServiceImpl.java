package com.lzy.service.impl;

import com.lzy.dao.BookDao;
import com.lzy.dao.CartDao;
import com.lzy.dao.Userdao;
import com.lzy.domain.Book;
import com.lzy.domain.Cart;
import com.lzy.domain.Result;
import com.lzy.domain.Users;
import com.lzy.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Autowired
    private Userdao userdao;

    @Autowired
    public BookDao bookDao;


    @Override
    public List<Cart> getCart(Integer userId) {
        return cartDao.findAllByUserUserId(userId);
    }

    @Override
    public Result updateCart(Integer num, Integer bookId, Integer userId) {
        Users user = userdao.findUsersByUserId(userId);
        Book book = bookDao.findBookByBookId(bookId);
        System.out.println(user);
        System.out.println(book);
//        Cart cart = new Cart();
        Cart cart = cartDao.findCartByBook_BookIdAndUserUserId(bookId, userId);
        cart.setBookQuantity(num);
        cart.setBook(book);
        cart.setUser(user);
        cartDao.save(cart);
        Result result = new Result();
        List<Cart> carts = getCart(userId);
        Integer allPrice = 0;
        Integer smallPrice = 0;
        smallPrice += num * cart.getBook().getBookPrice();
        for (Cart cart1 : carts) {
            allPrice += cart1.getBook().getBookPrice() * cart1.getBookQuantity();
        }
        result.setAllPrice(allPrice);
        result.setSmallPrice(smallPrice);
        return result;

    }

    @Override
    public void saveCart(Integer num, Integer bookId, Integer userId) {
        Users user = userdao.findUsersByUserId(userId);
        Book book = bookDao.findBookByBookId(bookId);
        Cart cart = cartDao.findCartByBook_BookIdAndUserUserId(bookId, userId);
        if (cart != null) {
            Integer bookQuantity = cart.getBookQuantity();
            cart.setBookQuantity(bookQuantity++);
            cartDao.save(cart);
        } else {
            Cart newCart = new Cart();
            newCart.setBook(book);
            newCart.setUser(user);
            newCart.setBookQuantity(num);
            cartDao.save(newCart);
        }


    }


}

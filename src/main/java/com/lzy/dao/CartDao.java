package com.lzy.dao;

import com.lzy.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartDao extends JpaRepository<Cart,Long> {
    List<Cart> findAllByUserUserId(Integer UserId);
    Cart findCartByBook_BookIdAndUserUserId(Integer bookId,Integer userId);

}

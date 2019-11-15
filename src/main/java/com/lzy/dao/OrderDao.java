package com.lzy.dao;

import com.lzy.domain.Orderinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDao extends JpaRepository<Orderinfo,Integer> {
}

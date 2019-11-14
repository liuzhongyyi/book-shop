package com.lzy.dao;

import com.lzy.domain.Booktype;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTypeDao extends JpaRepository<Booktype,Integer> {

}

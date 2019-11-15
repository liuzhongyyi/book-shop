package com.lzy.dao;

import com.lzy.domain.Book;

import com.lzy.domain.BookView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface BookDao extends JpaRepository<Book,Long>, JpaSpecificationExecutor<Book> {
    List<Book> findAllByBookTypeId(Integer id);
    Book findBookByBookId(Integer id);


}

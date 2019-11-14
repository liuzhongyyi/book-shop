package com.lzy.service;

import com.lzy.domain.Book;
import com.lzy.domain.Booktype;

import java.util.List;

public interface BookTypeService {
    public List<Booktype> getAllBookType();
    List<Book> findAllByBookTypeId(Integer id);
}

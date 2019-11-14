package com.lzy.service.impl;

import com.lzy.dao.BookDao;
import com.lzy.dao.BookTypeDao;
import com.lzy.domain.Book;
import com.lzy.domain.Booktype;
import com.lzy.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookTypeServiceImpl implements BookTypeService {
    @Autowired
    private BookTypeDao bookTypeDao;
    @Autowired
    private BookDao bookDao;
    @Override
    public List<Booktype> getAllBookType() {
        return bookTypeDao.findAll();
    }

    @Override
    public List<Book> findAllByBookTypeId(Integer id) {
        return bookDao.findAllByBookTypeId(id);
    }
}

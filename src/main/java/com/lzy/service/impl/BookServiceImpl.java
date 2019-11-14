package com.lzy.service.impl;

import com.lzy.dao.BookDao;
import com.lzy.dao.BookViewDao;
import com.lzy.domain.Book;
import com.lzy.domain.BookView;
import com.lzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private  BookDao bookDao;
    @Autowired
    private BookViewDao bookViewDao;
    @Override
    public List<Book> getAllBook() {
        return bookDao.findAll();
    }

    @Override
    public BookView getbookView(Integer bookId) {
       return bookViewDao.getBookView(bookId);
    }


    @Override
    public List<Book> getAllBookWithLike(String bookName,String bookAuthor) {
        return bookDao.findAll((Specification<Book>) (root, criteriaQuery, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            if(bookName!=null&&!"".equals(bookName)){
                Predicate pr = criteriaBuilder.like(root.get("bookName").as(String.class), "%" + bookName + "%");
                predicates.add(pr);
            }
            if(bookAuthor!=null&&!"".equals(bookAuthor)){
                Predicate pr = criteriaBuilder.like(root.get("bookAuthor").as(String.class), "%" + bookAuthor + "%");
                predicates.add(pr);
            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[]{}));
        });
    }
}

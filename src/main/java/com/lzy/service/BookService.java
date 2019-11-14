package com.lzy.service;

import com.lzy.domain.Book;
import com.lzy.domain.BookView;

import java.util.List;
import java.util.function.Predicate;

public interface BookService {
    public List<Book> getAllBook();
    public BookView getbookView(Integer bookId);
    public List<Book> getAllBookWithLike(String bookName,String bookAuthor);
}

package com.lzy.dao;

import com.lzy.domain.BookView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookViewDao extends JpaRepository<BookView,Integer> {

    @Query(value = "select * from bookView where bookId =?1",nativeQuery = true)
    BookView getBookView(Integer bookId);
}

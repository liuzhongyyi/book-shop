package com.lzy.controller;

import com.lzy.domain.Book;

import com.lzy.domain.BookView;
import com.lzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @ResponseBody
    @GetMapping("/getAllBook")
    public List<Book> getAllBook(){
       return bookService.getAllBook();
    }

    @GetMapping("/getBookDetail")
    public ModelAndView getBookDetail(Integer bookId){
        BookView bookView = (BookView) bookService.getbookView(bookId);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("book");
        modelAndView.getModel().put("book",bookView);
        return modelAndView;
    }
    @RequestMapping("/selectBook")
    public ModelAndView selectBook(String bookName,String bookAuthor){
        System.out.println(bookName);
        System.out.println(bookAuthor);
        ModelAndView modelAndView = new ModelAndView();
        List<Book> allBookWithLike = bookService.getAllBookWithLike(bookName, bookAuthor);
        modelAndView.setViewName("bookList");
        modelAndView.getModel().put("bookList",allBookWithLike);
        return modelAndView;

    }
}

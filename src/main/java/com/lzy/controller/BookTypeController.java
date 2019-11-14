package com.lzy.controller;

import com.lzy.domain.Book;
import com.lzy.domain.Booktype;
import com.lzy.service.BookService;
import com.lzy.service.BookTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookTypeController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BookTypeService bookTypeService;

    @ResponseBody
    @RequestMapping("/getAllBookType")
    public List<Booktype> getAllBookType(){
       return bookTypeService.getAllBookType();
    }

    @GetMapping("/getBookByType")
    public ModelAndView getBookByTypeId(Integer bookTypeId){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("bookList");
        if(bookTypeId==0){
            List<Book> allBook = bookService.getAllBook();
            modelAndView.getModel().put("bookList",allBook);
            return  modelAndView;
        }else {
            List<Book> allBook = bookTypeService.findAllByBookTypeId(bookTypeId);
            modelAndView.getModel().put("bookList",allBook);
            return  modelAndView;
        }

    }
}

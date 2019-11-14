package com.lzy.controller;


import com.lzy.dao.BookDao;
import com.lzy.domain.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
public class HelloController {

    @Autowired
    private BookDao bookDao;




}

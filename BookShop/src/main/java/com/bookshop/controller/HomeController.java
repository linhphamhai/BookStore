package com.bookshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookshop.entities.OrderState;
import com.bookshop.service.AuthorService;
import com.bookshop.service.AuthorServiceImpl;
import com.bookshop.service.BookService;
import com.bookshop.service.BookTypeService;
import com.bookshop.service.BookTypeServiceImpl;
import com.bookshop.service.OrderStateService;
import com.bookshop.service.OrderStateServiceImpl;
import com.bookshop.service.PublisherService;
import com.bookshop.service.PublisherServiceImpl;

@Controller
public class HomeController {
	
	@Autowired
	private BookService bookService;
	@RequestMapping("/")
	public String showHome(ModelMap model){
		model.put("lstBooks", bookService.getBookByPage(1));
		return "home";
	}
}

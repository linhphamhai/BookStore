package com.bookshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookshop.entities.BookType;
import com.bookshop.service.BookTypeService;

@Controller
@RequestMapping("booktype")
public class BookTypeController {

	@Autowired
	private BookTypeService bookTypeService;
	
	@RequestMapping(value="api/get-alls",method=RequestMethod.GET, produces={"application/json"})
	public @ResponseBody List<BookType> getBookTypes(){
		return bookTypeService.getAllBookType();
	}
}

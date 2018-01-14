package com.bookshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookshop.dao.BookDao;
import com.bookshop.entities.Book;

@Service("bookService")
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;

	public List<Book> getBookByPage(int page) {
		return bookDao.getBookByPage(page);
	}
	
	
	
}

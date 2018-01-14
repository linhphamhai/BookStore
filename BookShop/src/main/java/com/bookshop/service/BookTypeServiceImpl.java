package com.bookshop.service;

import java.util.List;

import com.bookshop.dao.BookTypeDaoImpl;
import com.bookshop.entities.BookType;

public class BookTypeServiceImpl implements BookTypeService{

	private BookTypeDaoImpl bookTypeDao;

	public List<BookType> getAllBookType() {
		return bookTypeDao.getAllBookType();
	}
	
	public void setBookTypeDao(BookTypeDaoImpl bookTypeDao) {
		this.bookTypeDao = bookTypeDao;
	}
	
}

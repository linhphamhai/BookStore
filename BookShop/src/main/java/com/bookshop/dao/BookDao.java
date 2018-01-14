package com.bookshop.dao;

import java.util.List;

import com.bookshop.entities.Book;

public interface BookDao {
	
	public List<Book> getBookByPage(int page);
}

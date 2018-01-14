package com.bookshop.service;

import java.util.List;

import com.bookshop.entities.Book;

public interface BookService {
	public List<Book> getBookByPage(int page);
}

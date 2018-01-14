package com.bookshop.service;

import java.util.List;

import com.bookshop.dao.AuthorDaoImpl;
import com.bookshop.entities.Author;

public class AuthorServiceImpl implements AuthorService{
	
	private AuthorDaoImpl authorDao;
	public List<Author> getAllAuthor() {
		return authorDao.getAllAuthor();
	}
	
	public void setAuthorDao(AuthorDaoImpl authorDao) {
		this.authorDao = authorDao;
	}
	
	

}

package com.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.bookshop.entities.Author;
import com.bookshop.entities.BookType;

public class AuthorDaoImpl implements AuthorDao{
	private SessionFactory sessionFactory;
	public List<Author> getAllAuthor() {
		List<Author> lstAuthors = new ArrayList<Author>();
		lstAuthors = sessionFactory.openSession().createCriteria(Author.class).list();
		return lstAuthors;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}

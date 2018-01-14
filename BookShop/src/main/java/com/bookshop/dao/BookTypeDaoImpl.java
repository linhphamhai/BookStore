package com.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.bookshop.entities.BookType;
import com.bookshop.entities.Publisher;

public class BookTypeDaoImpl implements BookTypeDao{
	private SessionFactory sessionFactory;

	public List<BookType> getAllBookType() {
		List<BookType> lstBookTypes = new ArrayList<BookType>();
		lstBookTypes = sessionFactory.openSession().createCriteria(BookType.class).list();
		return lstBookTypes;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}

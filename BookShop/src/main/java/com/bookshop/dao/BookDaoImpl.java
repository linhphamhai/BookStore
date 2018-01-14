package com.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bookshop.entities.Book;

@Component("bookDao")
public class BookDaoImpl  implements BookDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Book> getBookByPage(int page) {
		List<Book> lstBooks = new ArrayList<Book>();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Book");
		query.setFirstResult(0);
		query.setMaxResults(10);
		lstBooks = query.list();
		return lstBooks;
	}
	
	

}

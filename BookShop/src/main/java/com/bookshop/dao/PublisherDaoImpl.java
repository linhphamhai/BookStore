package com.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;

import com.bookshop.entities.Publisher;

public class PublisherDaoImpl implements PublisherDao{
	private SessionFactory sessionFactory;

	public List<Publisher> getAllPublisher() {
		List<Publisher> lstPublushers = new ArrayList<Publisher>();
		lstPublushers = sessionFactory.openSession().createCriteria(Publisher.class).list();
		return lstPublushers;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}

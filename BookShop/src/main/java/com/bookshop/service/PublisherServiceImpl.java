package com.bookshop.service;

import java.util.List;

import com.bookshop.dao.PublisherDaoImpl;
import com.bookshop.entities.Publisher;

public class PublisherServiceImpl implements PublisherService{
	
	private PublisherDaoImpl publisherDao;
	
	public List<Publisher> getAllPublisher() {
		return publisherDao.getAllPublisher();
	}

	public void setPublisherDao(PublisherDaoImpl publisherDao) {
		this.publisherDao = publisherDao;
	}
	
	

}

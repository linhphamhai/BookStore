package com.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bookshop.entities.OrderState;

@Component
public class OrderStateDaoImpl implements OrderStateDao{
	private SessionFactory sessionFactory;
	
	public List<OrderState> getAll() {
		List<OrderState> results = new ArrayList<OrderState>();
		results = sessionFactory.openSession().createCriteria(OrderState.class).list();
		System.out.println(results.size());
		return results;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	

}

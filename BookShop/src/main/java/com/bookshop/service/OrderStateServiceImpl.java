package com.bookshop.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookshop.dao.OrderStateDaoImpl;
import com.bookshop.entities.OrderState;

@Service
public class OrderStateServiceImpl implements OrderStateService{
	public OrderStateDaoImpl orderStateDao;
	

	public List<OrderState> getAll() {
		return orderStateDao.getAll();
	}

	public void setOrderStateDao(OrderStateDaoImpl orderStateDao) {
		this.orderStateDao = orderStateDao;
	}

	
}

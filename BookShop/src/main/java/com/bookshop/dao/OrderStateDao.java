package com.bookshop.dao;

import java.util.ArrayList;
import java.util.List;

import com.bookshop.entities.OrderState;

public interface OrderStateDao {
	
	public List<OrderState> getAll();
}

package com.lomd.control.item.service;

import java.util.List;

import com.lomd.control.item.model.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);

}

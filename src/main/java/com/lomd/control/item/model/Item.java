package com.lomd.control.item.model;

import lombok.Data;

@Data
public class Item {
	
	private Producto producto;
	private Integer cantidad;
	
	public Double getTotal() {
		return producto.getPrecio() * cantidad.doubleValue();
	}

}

package com.lomd.control.item.model;

import lombok.Data;

@Data
public class Item {

	public Item() {
	}

	public Item(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	private Producto producto;
	private Integer cantidad;

	public Double getTotal(Producto p, int i) {
		return producto.getPrecio() * cantidad.doubleValue();
	}

}

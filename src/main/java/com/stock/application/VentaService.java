package com.stock.application;

import java.util.List;

import com.stock.domain.Venta;

public interface VentaService {

	List<Venta> findAll();

	Venta save(Venta venta);

	Venta update(Venta venta);

	void delete(String id);
}
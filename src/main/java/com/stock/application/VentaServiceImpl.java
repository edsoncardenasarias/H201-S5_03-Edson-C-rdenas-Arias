package com.stock.application;

import java.util.List;

import com.stock.domain.Venta;
import com.stock.domain.VentaRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class VentaServiceImpl implements VentaService{

	private final VentaRepository repository;
	
	@Override
	public List<Venta> findAll() {
		return this.repository.findAll();
	}

	@Override
	public Venta save(Venta venta) {
		return this.repository.save(venta);
	}

	@Override
	public Venta update(Venta venta) {
		return this.repository.save(venta);
	}

	@Override
	public void delete(String id) {
		this.repository.deleteById(id);
	}
}
package com.ventas.application;

import java.util.List;

import com.ventas.domain.Venta;
import com.ventas.domain.VentaRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VentaServiceImpl implements VentaService {
	
	private final VentaRepository repository;

	@Override
	public List<Venta> findAll() {
		return repository.findAll();
	}

	@Override
	public Venta save(Venta venta) {
		return repository.save(venta);
	}

	@Override
	public Venta update(Venta venta) {
		return repository.save(venta);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}
}
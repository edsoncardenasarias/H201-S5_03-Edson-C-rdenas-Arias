package com.ventas.rest;

import java.util.List;

import com.ventas.application.VentaService;
import com.ventas.domain.Venta;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/venta")
@RequiredArgsConstructor
public class VentaController {

	private final VentaService service;
	
	@PostMapping("/save")
	private Venta saveVenta(@RequestBody Venta venta) {
		return service.save(venta);
	}
	
	@GetMapping("/all")
	public List<Venta> findAll() {
		return service.findAll();
	}
}
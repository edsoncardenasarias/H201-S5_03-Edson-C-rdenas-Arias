package com.stock.rest;

import com.stock.application.VentaService;
import com.stock.domain.Venta;

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
	
	@PostMapping
	private Venta saveVenta(@RequestBody Venta venta) {
		return this.service.save(venta);
	}
}
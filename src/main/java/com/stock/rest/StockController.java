package com.stock.rest;

import com.stock.application.StockService;
import com.stock.domain.Stock;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/stock")
@RequiredArgsConstructor
public class StockController {

	private final StockService service;

	@GetMapping("/{id}")
	public Stock findByProductId(@PathVariable String id) {
		return service.findByProductId(id);
	}

	@PostMapping
	public Stock save(@RequestBody Stock stock) {
		return service.save(stock);
	}

	@PutMapping("/add")
	public Stock addAmountById(@RequestParam("amount") Integer amount, @RequestParam("stockId") String stockId) {
		return service.addAmountById(amount, stockId);
	}

	@PutMapping("/disc")
	public Stock desCant(@RequestParam("cant") Integer cant, @RequestParam("stockId") String stockId) {
		return service.desCant(cant, stockId);
	}
}
package com.compras.rest;

import java.util.List;

import com.compras.application.ProductService;
import com.compras.domain.Product;
import com.compras.domain.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compras")
public class ProductController {

	private ProductRepository repository;
	
	@Autowired
	private ProductService service = new ProductService(repository);
	
	@GetMapping("/all")
	public List<Product> findAll() {
		return this.service.findAll();
	}
	
	@GetMapping("/product/{id}")
	public Product findCompraById(@PathVariable String id) {
		return this.service.findProductById(id);
	}
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return this.service.create(product);
	}
	
	@PutMapping
	public ResponseEntity<?> update(@RequestBody Product product) {
		return this.service.update(product);
	}
	
	@DeleteMapping
	public ResponseEntity<?> delete(@PathVariable String id) {
		return this.service.delete(id);
	}
}
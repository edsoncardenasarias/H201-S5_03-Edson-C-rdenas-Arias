package com.compras.application;

import java.util.List;

import com.compras.domain.Product;
import com.compras.domain.ProductRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	private ProductRepository repository;

	public ProductService(ProductRepository repository) {
		super();
		this.repository = repository;
	}

	public List<Product> findAll() {
		return repository.findAll();
	}

	public Product findProductById(String id) {
		return repository.findItemById(id);
	}

	public Product create(Product product) {
		System.out.println(product.toString());
		return repository.create(product);
	}

	public ResponseEntity<?> update(Product product) {
		repository.update(product);
		return new ResponseEntity<String>("Product update.", HttpStatus.CREATED);
	}

	public ResponseEntity<?> delete(String id) {
		repository.delete(id);
		return new ResponseEntity<String>("Product delete.", HttpStatus.CREATED);
	}
}
package com.compras.application;

import java.util.List;

import com.compras.domain.Product;
import com.compras.domain.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ProductImpl implements ProductRepository {
	
	@Autowired
	private final MongoOperations operations;
	
	public ProductImpl(MongoOperations operations) {
		super();
		this.operations = operations;
	}

	@Override
	public List<Product> findAll() {
		return this.operations.findAll(Product.class);
	}

	@Override
	public Product findItemById(String id) {
		return this.operations.findOne(new Query(Criteria.where("id").is(id)), Product.class);
	}

	@Override
	public Product create(Product product) {
		System.out.println(product.toString());
		return this.operations.save(product);
	}

	@Override
	public void update(Product product) {
		this.operations.save(product);
	}

	@Override
	public void delete(String id) {
		this.operations.findAndRemove(new Query(Criteria.where("id").is(id)), Product.class);
	}
}
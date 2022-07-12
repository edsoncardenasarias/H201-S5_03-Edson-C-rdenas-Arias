package com.stock.domain;

import org.springframework.stereotype.Component;

@Component
public class ProductHystrixFallbackFactory implements ProductClient {

	@Override
	public Product findProductById(String id) {
		Product product = new Product();
		
		Product prod = Product.builder()
				.id(id)
				.name(product.getName())
				.price(product.getPrice())
				.amount(product.getAmount())
				.build();
		return prod;
	}
}
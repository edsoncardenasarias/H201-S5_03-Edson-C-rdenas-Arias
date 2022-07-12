package com.ventas.domain;

import org.springframework.stereotype.Component;

@Component
public class ProductHystrixFallbackFactory implements ProductClient {

	@Override
	public Product findById(String id) {
		Product product = new Product();
		return Product.builder()
				.id(id)
				.name(product.getName())
				.stock(product.getStock())
				.price(product.getPrice())
				.build();
	}
}
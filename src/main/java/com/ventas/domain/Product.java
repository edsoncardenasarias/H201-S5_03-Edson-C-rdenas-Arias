package com.ventas.domain;

import java.math.BigDecimal;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

	private String id;
	private String name;
	private Integer stock;
	private BigDecimal price;
}
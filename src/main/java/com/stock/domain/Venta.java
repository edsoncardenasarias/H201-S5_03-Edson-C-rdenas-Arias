package com.stock.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "ventas")
public class Venta {

	@Id
	private String id;
	private String clientId;
	private Product product;
	private String status;
}
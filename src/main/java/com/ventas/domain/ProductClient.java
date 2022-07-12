package com.ventas.domain;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "compras-service", fallback = ProductHystrixFallbackFactory.class)
public interface ProductClient {

	@GetMapping(value =  "/compras/{id}")
	Product findById(@PathVariable String id);
}
package com.stock.application;

import com.stock.domain.Stock;

public interface StockService {

	Stock findByProductId(String id);

	Stock save(Stock stock);

	Stock addAmountById(Integer amount, String stockId);

	Stock desCant(Integer cant, String stockId);
}
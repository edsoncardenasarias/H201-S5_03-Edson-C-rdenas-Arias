package com.stock.application;

import java.util.Optional;

import com.stock.domain.Stock;
import com.stock.domain.StockRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {

	private final StockRepository repository;

	@Override
	public Stock findByProductId(String id) {
		return this.repository.findByProductId(id).get();
	}

	@Override
	public Stock save(Stock stock) {
		return this.repository.save(stock);
	}

	@Override
	public Stock addAmountById(Integer amount, String stockId) {
		if (amount >= 0) {
			Optional<Stock> optStock = repository.findByProductId(stockId);
			if (optStock.isPresent()) {
				Stock stock = optStock.get();
				Integer newStock = stock.getCant() + amount;
				stock.setCant(newStock);
				return repository.save(stock);
			}
		}
		return null;
	}

	@Override
	public Stock desCant(Integer cant, String stockId) {
		if (cant >= 0) {
			Optional<Stock> optStock = repository.findByProductId(stockId);
			if (optStock.isPresent()) {
				Stock stock = optStock.get();
				if (cant <= stock.getCant()) {
					Integer newStock = cant - stock.getCant();
					stock.setCant(newStock);
					return repository.save(stock);
				}
			}
		}
		return null;
	}
}
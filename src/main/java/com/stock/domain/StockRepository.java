package com.stock.domain;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends MongoRepository<Stock, String>{

	Optional<Stock> findByProductId(String id);
}
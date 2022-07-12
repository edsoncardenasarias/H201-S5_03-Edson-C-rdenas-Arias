package com.stock.domain;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends MongoRepository<Venta, String>{
}
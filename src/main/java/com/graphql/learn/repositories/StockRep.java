package com.graphql.learn.repositories;

import com.graphql.learn.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRep extends JpaRepository<Stock, Integer> {

}

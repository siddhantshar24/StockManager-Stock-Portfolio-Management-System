package com.graphql.learn.services;

import com.graphql.learn.entities.Stock;

import java.util.List;

public interface StockService {
    //create
    Stock create(Stock stock);

    //get all
    List<Stock> getAll();

    Stock get(int stockId);

}

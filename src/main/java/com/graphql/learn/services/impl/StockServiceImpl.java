package com.graphql.learn.services.impl;

import com.graphql.learn.entities.Stock;
import com.graphql.learn.repositories.StockRep;
import com.graphql.learn.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceImpl implements StockService {

    private StockRep stockRep;

    @Autowired
    public StockServiceImpl(StockRep stockRep) {
        this.stockRep = stockRep;
    }

    @Override
    public Stock create(Stock stock) {
        return this.stockRep.save(stock);
    }

    @Override
    public List<Stock> getAll() {
        return stockRep.findAll();
    }

    @Override
    public Stock get(int stockId) {
        return this.stockRep.findById(stockId).orElseThrow(()->new RuntimeException("Stock you are looking for not found on server"));
    }
}

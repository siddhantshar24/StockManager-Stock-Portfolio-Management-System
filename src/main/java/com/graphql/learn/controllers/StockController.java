package com.graphql.learn.controllers;

import com.graphql.learn.entities.Stock;
import com.graphql.learn.repositories.StockRep;
import com.graphql.learn.services.StockService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class StockController {

    @Autowired
    private StockService stockService;
    @Autowired
    private StockRep stockRep;

    //create
    @MutationMapping("createStock")
    public Stock create(@Argument StockInput stock){
        Stock b=new Stock();
        b.setName(stock.getName());
        b.setPrice(stock.getPrice());
        return this.stockService.create(b);
    }

    //get all
    @QueryMapping("allStocks")
    public List<Stock> getAll()
    {
        return this.stockService.getAll();
    }

    //get single stock
    @QueryMapping("getStock")
    public Stock get(@Argument int stockID)
    {
        return this.stockService.get(stockID);
    }
}
@Getter
@Setter
class StockInput{
    private String name;
    private double price;

}
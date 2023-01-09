package com.graphql.learn;

import com.graphql.learn.entities.Stock;
import com.graphql.learn.services.StockService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphqlProjectApplication implements CommandLineRunner {
    @Autowired
    private StockService stockService;
    public static void main(String[] args) {
        SpringApplication.run(GraphqlProjectApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Stock b1=new Stock();
        b1.setName("Ted Baker");
        b1.setPrice(5000);

        Stock b2=new Stock();
        b2.setName("TalkTalk Telecom Group");
        b2.setPrice(6000);

        Stock b3=new Stock();
        b3.setName("XYZW");
        b3.setPrice(7000);

        if(valid(b1.getName()))
        {this.stockService.create(b1);}
        if(valid(b2.getName()))
        {this.stockService.create(b2);}
        if(valid(b3.getName()))
        {this.stockService.create(b3);}


    }
    Boolean valid(String s)
    {
        final String url =
                "https://web.archive.org/web/20190104110157/http://shares.telegraph.co.uk/indices/?index=MCX";
        Boolean answer=false;
        try {
            final Document document = Jsoup.connect(url).get();

            for (Element row : document.select(
                    "table.tablesorter.full tr")) {
                if (row.select("td:nth-of-type(1)").text().equals("")) {
                    continue;
                }
                else {
                    final String name =
                            row.select("td:nth-of-type(2)").text();
                    if(name.equals(s))
                    {
                        answer=true;
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return answer;
    }
}

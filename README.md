# Stocks-Portfolio-SpringBoot-GraphQL-with-crawler
REST API Project for building a Stock Market Portfolio for a user using CRUD (Create Retrieve Update Delete) applications through API implemented using JPA Repository in Springboot Framework.

Technologies used: Java, SpringBoot, REST API, JPA Repository, Postman, JSoup.

Description about technologies used:

REST API is used for basic CRUD operations, i.e. GET, POST, DELETE and UPDATE.

The application is used for Storing information of Library Books using these CRUD methods accessed via JPA repository.

GraphQL is used for querying specified elements from the portfolio because it will save memory space compared for normal SQL queries.

Jsoup library is used for cross checking the validity of the Stock that is being added to the Portfolio, if the stock is not valid at all as per today, then it is not added to the Portfolio and is skipped so that invalid values are dropped by default when portfolio updation is concerned. We scrape the data from Stock Market page and check the validity of the stock by scraping the element that corresponds to the name of the stock in the webpage.


To start the project in your local:


-Go to main folder in Intellij/Eclipse and run the application as a SpringBoot Application

-For inserting/deleting values, use Postman and select appropriate function i.e. GET, POST, DELETE or UPDATE. For UPDATE/ POST operations, write JSON queries in the Postman Application.

-For making GraphQL queries, try to write JSON in appropriate format and use GraphQL section in Postman application.

-Make sure your server is up and running before using Postman for sending requests.

Thanks

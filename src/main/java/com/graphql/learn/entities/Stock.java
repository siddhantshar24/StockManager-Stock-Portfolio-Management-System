package com.graphql.learn.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "project_stock")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double price;


}

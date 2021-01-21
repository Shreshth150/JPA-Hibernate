package com.myapp.jpa.Models;
import javax.persistence.*;

@Entity
//@Table(name = "my_book")
public class Book {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    // Auto is used to increment teh values from Hibernate

    // Identity when we want increment values from MYSQL Servere.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

//    @Column(name = "book_name")
    private String name ;

    private String authorName ;

//    @Column(name = "price")
    private int cost ;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Book(String name, String authorName, int cost) {
//        this.id = id ;
        this.name = name;
        this.authorName = authorName;
        this.cost = cost;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "{ name = " + this.getName() + ", authorName = " + this.getAuthorName() + ", cost = " + this.getCost() + "}";
    }
}

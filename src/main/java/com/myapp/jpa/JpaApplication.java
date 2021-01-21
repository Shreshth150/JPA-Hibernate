package com.myapp.jpa;

import com.myapp.jpa.Models.Book;
import com.myapp.jpa.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Autowired
    BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        List<Book> books = new ArrayList<>();

//
//        Book b1 = new Book("Git", "Tim", 300);
        Book b2 = new Book("ABC", "Shashi", 40);
        Book b3 = new Book("Python", "bob", 250);

//        Book b1 = new Book(1,"Coding" , "Abdul bari" , 250);
//        Book b2 = new Book(2 , "DsAlgo" , "Summet malik" , 250);


//        books.add(b1);
        books.add(b2);
        books.add(b3);
        bookRepository.saveAll(books);

//        System.out.println(bookRepository.findAll());

//        bookRepository.save(b1);
//        System.out.println(bookRepository.findByAuthorName("Shashi"));
//          System.out.println(bookRepository.findByAuthor("Shashi"));
//        System.out.println(bookRepository.findByAuthors("Abhay"));

//        System.out.println(bookRepository.findByCost(40));
//        System.out.println(bookRepository.findBycost(40));
//        System.out.println(bookRepository.findById(2));
    }
}
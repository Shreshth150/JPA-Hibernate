package com.myapp.jpa.Repository;

import com.myapp.jpa.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book , Integer> {

//    public List<Book> findByAuthorName(String name);

    //* We can have both the methods as findByAuthorname & findByAuthor but
    // second one will not work directly as its not a property defined in Book Class
    // So to make a function like this work But should annotate it using @Query
    // and provide the query along with it . which can be either
    // JPQL or Native Query Language.

// Only the Function Name differs

    // **findBy<prob_name>**

    // In the Native Query Language we have to provide the parameter's Name same as
    // in Database or in table
    @Query(value = "select * from Book b where b.author_name=:name", nativeQuery = true)
    public List<Book> findByAuthor(String name);

    // In JPQL Syntax we have to use the Parameters Same as Property Names
    @Query(value = "select b from Book b where b.authorName =:authors_name")
    public  List<Book> findByAuthors(String authors_name);

    List<Book> findByCost(int cost);

    List<Book> findBycost(int cost);

    Book findById(int id);
}
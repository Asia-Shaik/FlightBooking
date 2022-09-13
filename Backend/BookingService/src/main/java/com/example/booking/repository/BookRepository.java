package com.example.booking.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.booking.model.Book;



public interface BookRepository extends MongoRepository<Book, Integer>{

	boolean existsById(int id);

	List<Book> findAll();

}

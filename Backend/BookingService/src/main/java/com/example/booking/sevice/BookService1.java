package com.example.booking.sevice;

import java.util.List;

import com.example.booking.model.Book;


public interface BookService1 {
	public String addBook(Book book)throws BookValidationException;  
	public List<Book>getBook();



	public String deleteBook(int id);
	public Book updateNameById(int id, Book book);
	
	
	}

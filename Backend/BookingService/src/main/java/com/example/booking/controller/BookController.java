package com.example.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.booking.model.Book;
import com.example.booking.sevice.BookService;
import com.example.booking.sevice.BookValidationException;

@CrossOrigin(origins = "http://localhost:52851")
@RestController
@RequestMapping("/book")
public class BookController {

@Autowired
   private BookService bookservice;
private int id;

@PostMapping("/addBook")
    public String addBook(@RequestBody Book book)  throws BookValidationException{
	return bookservice.addBook(book);
       }


    @GetMapping("/findAllBooks")
 public List<Book> getbook(){
  return bookservice.getBook();
  
  
   }
    @DeleteMapping("/delete/{id}")
 public String deleteBooks(@PathVariable int id) {
 bookservice.deleteBook(id);
     return "book deleted with id: "+id;
     
    }
    
   @PutMapping("/update/{id}")
        public Book updateBooks(@PathVariable int id,@RequestBody Book book) {
	return bookservice.updateNameById(id , book);
	    
    }
}
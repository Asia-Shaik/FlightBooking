package com.example.booking.sevice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.booking.model.Book;
import com.example.booking.repository.BookRepository;


@Service
@Component
public class BookService  implements BookService1{
	
	
		//Calling Customer Repository
		private BookRepository bookRepository;
		BookService BookService;

		@Autowired
		public BookService(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
		}

		@Override
		public String addBook(Book book) throws BookValidationException  {
			if (bookRepository.existsById(book.getId()))
				throw new BookValidationException();
				else {  
		
			bookRepository.save(book);
			 return "Added Book with id:"+ book.getId();
		}


		}
		
		@Override
		public String deleteBook(int id) {
			bookRepository.deleteById(id);
		return "id deleted";

		}


		@Override
		public Book updateNameById(int id, Book book) {
			return bookRepository.save(book);

		}

		@Override
		public List<Book> getBook() {
		return bookRepository.findAll();
		}

		public void save(Book book) {
			// TODO Auto-generated method stub
			
		}

		


		}






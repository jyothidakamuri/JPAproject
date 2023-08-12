package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repositary.BookRepositary;

@Service
public class BookService {

@Autowired	
BookRepositary bookrepositary;

	public Book saveBook(Book book) {
		return bookrepositary.save(book);
		
	}

	public Book getBookInformation(int book_id) {
		return bookrepositary.findById(book_id).get();

	}
	
	public List<Book> getAllAuthorInformation() {
		return bookrepositary.findAll();
		
		
	}
	
	
	public Book updateBookInformation(Book book) {
		return  bookrepositary.save(book);

	}
	
	
	public String deleteBookInformation(int book_id) {
		 bookrepositary.deleteById(book_id);
		 return "Delete ONE Book Recored";

	}
	
	

	
	
	
}

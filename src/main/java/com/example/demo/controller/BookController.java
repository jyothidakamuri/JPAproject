package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("/book")

public class BookController {

	@Autowired
	BookService bookservice;
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book) {
		return bookservice.saveBook(book);
		
	}
	
	@GetMapping("/retriveBook/{book_id}")
	public Book getBookDetails(@PathVariable("book_id") int book_id) {
		return bookservice.getBookInformation(book_id);
			
	
	}
	
	@GetMapping("/retriveAllBookDetails")
	public List<Book> getAllBookDetails() {
		return bookservice.getAllAuthorInformation();
		
	}
	
		
		
	@PutMapping("/UpdateBook")
	public Book updateBookDetails(@RequestBody Book book) {
		return bookservice.updateBookInformation(book);
		
	}
		

	@DeleteMapping("/deleteRecord/{book_id}")
	public String deleteBookDetails(@PathVariable("book_id") int book_id) {
		return bookservice.deleteBookInformation(book_id);
	}
	
	
	}



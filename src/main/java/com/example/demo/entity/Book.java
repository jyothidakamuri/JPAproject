package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Book")
public class Book {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int book_id;
	
	@Column(name = "book_name")
	private String book_name;

	@Column(name= "book_price")
	private double book_price;
	
	@Column(name = "book_author")
	private String book_author;

	public Book(int book_id, String book_name, double book_price, String book_author) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_price = book_price;
		this.book_author = book_author;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getbook_name() {
		return book_name;
	}

	public void setbook_name(String book_name) {
		this.book_name = book_name;
	}

	public double getBook_price() {
		return book_price;
	}

	public void setBook_price(double book_price) {
		this.book_price = book_price;
	}

	public String getBook_author() {
		return book_author;
	}

	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	
	
}

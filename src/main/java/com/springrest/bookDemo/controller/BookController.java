package com.springrest.bookDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.bookDemo.pojo.Book;
import com.springrest.bookDemo.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return this.bookService.getAllBooks();
	}
	
	@GetMapping("/books/{bookId}")
	public Book getBookById(@PathVariable Integer bookId)
	{
		return bookService.getById(bookId);
		
	}
	
	@PostMapping("/books")
	public Book AddBook(@RequestBody Book book)
	{
		return bookService.AddBook(book);
		
	}
	
	@PutMapping("/books/{id}")
	public Book UpdateBook(@RequestBody Book book)
	{
		return bookService.UpdateBook(book);
		
	}
	
	@DeleteMapping("/books/{bookId}")
	public void DeletebookById(@PathVariable Integer bookId)
	{
		this.bookService.DeleteBookById(bookId);
	}
}

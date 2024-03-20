package com.springrest.bookDemo.service;

import java.util.List;

import com.springrest.bookDemo.pojo.Book;

public interface BookService {

	public List<Book> getAllBooks();
	public Book getById(Integer bookId);
	public Book AddBook(Book book);
	public Book UpdateBook(Book book);
	public void DeleteBookById(Integer bookId);
}

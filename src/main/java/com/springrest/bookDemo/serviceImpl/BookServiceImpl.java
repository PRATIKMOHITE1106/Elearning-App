package com.springrest.bookDemo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.bookDemo.dao.BookDao;
import com.springrest.bookDemo.exception.BookNotFoundException;
import com.springrest.bookDemo.pojo.Book;
import com.springrest.bookDemo.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Override
	public List<Book> getAllBooks() {
		
		if(bookDao.findAll().isEmpty())
			throw new BookNotFoundException("List Is EMpty adhi value tak");
		
		return bookDao.findAll();
	}

	@Override
	public Book getById(Integer bookId) {
		
		
		if(bookDao.findById(bookId).isEmpty())
			throw new BookNotFoundException("Book Not Found");
		
		return bookDao.findById(bookId).get(); 
	}

	@Override
	public Book AddBook(Book book) {
		
		return bookDao.save(book);
	}

	@Override
	public Book UpdateBook(Book book) {
		
		return bookDao.save(book);
	}

	@Override
	public void DeleteBookById(Integer bookId) {
		bookDao.deleteById(bookId);

	}

}

package com.springrest.bookDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.bookDemo.pojo.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

	
	
}

package com.adminportal.service;

import java.util.List;

import com.adminportal.entity.Book;

public interface BookService {
	
	Book save(Book book);
	
	List<Book> findAll();
	
	/* Book findOne(Long id); */
	/* Book findById(Long id); */
}

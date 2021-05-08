package com.adminportal.repository;

import org.springframework.data.repository.CrudRepository;

import com.adminportal.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long> {


}

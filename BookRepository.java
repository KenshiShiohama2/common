package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Book;

public interface BookRepository extends JpaRepository <Book, Integer>{

	List<Book> findAll();
	Optional<Book> findById(Integer id);
	List<Book> findByPublisher(String publisher);
	List<Book> findByPriceGreaterThanEqual(int price);
//	List<BookTitleOnly> findOnly();

}
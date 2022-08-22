package com.globallogic.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.demo.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

	 public List<Book> findByAuthor(String author);

	public List<Book> findByName(String name);

	public List<Book> findByNameAndAuthor(String name, String author);

}

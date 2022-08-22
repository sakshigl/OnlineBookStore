package com.globallogic.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globallogic.demo.entity.BookCategory;

public interface BookCategoryRepo extends JpaRepository<BookCategory, Integer> {

}

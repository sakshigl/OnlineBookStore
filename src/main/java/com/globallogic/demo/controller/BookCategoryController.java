package com.globallogic.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.globallogic.demo.entity.Book;
import com.globallogic.demo.entity.BookCategory;
import com.globallogic.demo.repo.BookCategoryRepo;
import com.globallogic.demo.repo.BookRepo;

@RestController
@RequestMapping("/bookcat")
public class BookCategoryController {
	
	@Autowired
	BookCategoryRepo bcatrepo;
	
	@Autowired
	BookRepo brepo;
	

	@GetMapping("/")
	public List<BookCategory> getBookcat() {
		return bcatrepo.findAll();
		
	}
	@PostMapping("/")
	public BookCategory saveBookcat(@RequestBody BookCategory bcat) {
	
		List<Book> books=new ArrayList<>();
		for(Book a:bcat.getBook()) {
			Book book=brepo.findById(a.getId()).get();
			books.add(book);
		}
		
		bcat.setBook(books);
		bcatrepo.save(bcat);
		return bcat;
	}
	@PutMapping("/")
	public BookCategory updateBookCat(@RequestBody BookCategory bcat)
	{
	
		
		bcatrepo.save(bcat);
		System.err.println(bcat);
		return bcat;
	}
	
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") Integer id)
	{
		System.err.println("deleted id is : "+id);
		bcatrepo.deleteById(id);
		return "Record Has been deleted !";
	}
	
	
}

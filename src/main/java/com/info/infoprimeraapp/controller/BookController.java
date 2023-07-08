package com.info.infoprimeraapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.info.infoprimeraapp.domain.Book;
import com.info.infoprimeraapp.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@GetMapping("/api/v1/book")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@PostMapping("/api/v1/book")
	public Book createBook(@RequestBody Book book) {
		return bookService.createBook(book);
	}
	
	@GetMapping("/api/v1/searchBook")
	public Book searchBook(@RequestParam(required = true, name = "titulo") String titulo) {
		return bookService.searchBook(titulo);
	}

}

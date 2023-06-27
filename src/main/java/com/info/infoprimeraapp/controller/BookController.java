package com.info.infoprimeraapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.infoprimeraapp.domain.Book;

@RestController
public class BookController {
	
	@GetMapping("/api/v1/book")
	public List<Book> getAllBooks(){
		return null;
	}

}

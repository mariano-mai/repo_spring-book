package com.info.infoprimeraapp.service;

import java.util.List;


import com.info.infoprimeraapp.domain.Book;

public interface BookService {
	
	List<Book> getAllBooks();
	
	Book createBook(Book book);
	
	Book searchBook(String titulo);

}

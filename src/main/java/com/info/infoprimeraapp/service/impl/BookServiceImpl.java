package com.info.infoprimeraapp.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.info.infoprimeraapp.domain.Book;
import com.info.infoprimeraapp.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	Map<UUID, Book> bookMap;
	Map<String, Book> bookMapByName;
	
	public BookServiceImpl() {
		bookMap = new HashMap<>();
		bookMapByName = new HashMap<>();
		
		Book book = new Book();
		book.setUuid(UUID.randomUUID());
		book.setAuthor("Gabriel García Marquez");
		book.setTitle("Cien Años de Soledad");
		
		Book book2 = new Book();
		book2.setUuid(UUID.randomUUID());
		book2.setAuthor("George Orwell");
		book2.setTitle("1984");
		
		Book book3 = new Book();
		book3.setUuid(UUID.randomUUID());
		book3.setAuthor("Antoine de Saint-Exupery");
		book3.setTitle("El Principito");
		
		bookMap.put(book.getUuid(),book);
		bookMap.put(book2.getUuid(),book2);
		bookMap.put(book3.getUuid(),book3);
		
		bookMapByName.put(book.getTitle(), book);
		bookMapByName.put(book2.getTitle(), book2);
		bookMapByName.put(book3.getTitle(), book3);
		
	}

	@Override
	public List<Book> getAllBooks() {
		
		return new ArrayList<>(bookMap.values());
		
	}

	@Override
	public Book createBook(Book book) {
		book.setUuid(UUID.randomUUID());
		bookMap.put(book.getUuid(), book);
		bookMapByName.put(book.getTitle(), book);
		return book;
	}

	@Override
	public Book searchBook(String titulo) {
		Book bookSearch = bookMapByName.get(titulo);
		return bookSearch;
	}

}

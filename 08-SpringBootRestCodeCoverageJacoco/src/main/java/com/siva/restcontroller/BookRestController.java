package com.siva.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.siva.bean.Book;
import com.siva.service.BookService;

@RestController
public class BookRestController {
	@Autowired
	private BookService bookService;

	@PostMapping(value = "/addbook", consumes = { "application/json" })
	public ResponseEntity<String> addBook(@RequestBody Book book) {
		String msg = null;
		boolean isSaved = bookService.saveBook(book);
		if (isSaved) {
			msg = "Book saved";
			return new ResponseEntity<>(msg, HttpStatus.CREATED);
		} else {
			msg = "Failed to save";
			return new ResponseEntity<>(msg, HttpStatus.BAD_REQUEST);
		}
	}
}

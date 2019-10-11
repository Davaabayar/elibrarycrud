package edu.mum.cs.cs425.demowebapps.elibrary.service;

import org.springframework.data.domain.Page;

import edu.mum.cs.cs425.demowebapps.elibrary.model.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {

	List<Book> getAllBooks();
}

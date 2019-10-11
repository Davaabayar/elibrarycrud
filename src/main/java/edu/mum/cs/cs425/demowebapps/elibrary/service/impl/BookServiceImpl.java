package edu.mum.cs.cs425.demowebapps.elibrary.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.demowebapps.elibrary.model.Book;
import edu.mum.cs.cs425.demowebapps.elibrary.repository.IBookRepository;
import edu.mum.cs.cs425.demowebapps.elibrary.service.IBookService;



@Service
public class BookServiceImpl implements IBookService {
	
	private IBookRepository bookRepository;
	
	@Autowired
	public BookServiceImpl(IBookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public List<Book> getAllBooks() {
		return (List<Book>)bookRepository.findAll();
	}

}
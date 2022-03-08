package com.infotech.bookstore.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.infotech.bookstore.dao.impl.BookDAOImpl;
import com.infotech.bookstore.model.Book;
import com.infotech.bookstore.service.BookService;
/**
 * This is a Service class which provides service to the controller
 */
public class BookServiceImpl implements BookService {

	@Override
	public List<Book> getAllBooksInfo() throws SQLException {
		return new BookDAOImpl().listAllBooks();
	}
}

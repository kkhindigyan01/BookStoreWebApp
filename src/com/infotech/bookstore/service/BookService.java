package com.infotech.bookstore.service;

import java.sql.SQLException;
import java.util.List;

import com.infotech.bookstore.model.Book;

public interface BookService {
	public abstract List<Book> getAllBooksInfo() throws SQLException;
}

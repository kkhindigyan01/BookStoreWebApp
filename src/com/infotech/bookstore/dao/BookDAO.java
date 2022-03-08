package com.infotech.bookstore.dao;

import java.sql.SQLException;
import java.util.List;

import com.infotech.bookstore.model.Book;

public interface BookDAO {

	public abstract List<Book> listAllBooks() throws SQLException;
}
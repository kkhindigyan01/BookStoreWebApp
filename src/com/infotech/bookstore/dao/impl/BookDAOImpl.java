package com.infotech.bookstore.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.infotech.bookstore.dao.BookDAO;
import com.infotech.bookstore.model.Book;
import com.infotech.bookstore.util.DBUtil;

/**
 * This DAO class provides database operation for the table book
 * in the database.
 */
public class BookDAOImpl implements BookDAO {
	
	@Override
	public List<Book> listAllBooks() throws SQLException {
		List<Book> listBook = new ArrayList<>();
		
		String sql = "SELECT * FROM book_table";
		
		try(Connection connection = DBUtil.getDataSource().getConnection();
			Statement statement =connection .createStatement();
			ResultSet resultSet = statement.executeQuery(sql)) {
			
			while (resultSet.next()) {
				int id = resultSet.getInt("book_id");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				float price = resultSet.getFloat("price");
				
				Book book = new Book(id, title, author, price);
				listBook.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listBook;
	}
	
}

package com.infotech.bookstore.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.infotech.bookstore.model.Book;
import com.infotech.bookstore.service.impl.BookServiceImpl;

/**
 * This servlet acts as a controller and handling all
 * requests from the user.
 */
public class BookControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			listBook(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void listBook(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Book> listBook = new BookServiceImpl().getAllBooksInfo();
		request.setAttribute("listBook", listBook);
		RequestDispatcher dispatcher = request.getRequestDispatcher("bookList.jsp");
		dispatcher.forward(request, response);
	}
}

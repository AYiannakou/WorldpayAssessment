package com.manager.offer.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/controller/remove")
public class DeleteOffer extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String productID = request.getParameter("id");
		int id = Integer.parseInt(productID);

		response.setContentType("text/plain");

		PrintWriter out = response.getWriter();

		AddOffer.getOffers().remove(id);

		out.println("Product number " + id + " has been deleted.");
	}
}

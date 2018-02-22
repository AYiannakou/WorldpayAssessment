package com.manager.offer.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller/offers")
public class Offers extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();

		HashMap<Integer, String> offers = AddOffer.getOffers();

		if (!offers.isEmpty()) {
			for (Map.Entry<Integer, String> entry : offers.entrySet()) {

				out.println("ID: " + entry.getKey() + " Product: " + entry.getValue());

			}

		} else {

			out.println("No offers available");

		}

	}

}

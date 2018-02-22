package com.manager.offer.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.http.HttpSession;
import com.manager.offer.Offer;

@WebServlet("/controller/add")
public class AddOffer extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public static HashMap<Integer, String> offers = new HashMap<>();

	Offer offer;
	int count;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String type = request.getParameter("type");
		String des = request.getParameter("des");
		String price = request.getParameter("price");

		HttpSession session = request.getSession(true);
		session.setMaxInactiveInterval(5);
		response.setContentType("text/plain");
		PrintWriter out = response.getWriter();

		if (session.isNew()) {

			offer = new Offer(type, des, price);

			offers.put(count, offer.toString());

			count++;
		}

		out.println("A new product has been added.");
	}

	public static HashMap<Integer, String> getOffers() {

		return offers;
	}

}
package com.manager.offer;

public class Offer {

	public String type;
	public String description;
	public String price;

	final String currency = "£";

	public Offer(String t, String d, String p) {

		this.type = t;
		this.description = d;
		this.price = p;

	}

	public String getDescription() {

		return this.description;

	}

	public String getPrice() {

		return this.price;

	}

	public String getTypeOffer() {

		return this.type;

	}

	public String toString() {

		return "Type: " + getTypeOffer() + " , " + "Description: " + getDescription() + " , " + "Price: " + currency + " " + getPrice();

	}

}

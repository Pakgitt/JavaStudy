package com.kh.example.practice2.model.vo;

public class Product {
	private String pName;
	private int price;
	private String brand;

	public Product() {

	}

	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}

	public void information() {
		System.out.println(pName + " " + price + " " + brand);

	}

}

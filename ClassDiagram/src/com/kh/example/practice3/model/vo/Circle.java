package com.kh.example.practice3.model.vo;

public class Circle {
	private final double PI = 3.14;
	private int radius = 1;

	public Circle() {

	}

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public void incrementRadius() {
		radius++;
		System.out.println("원 반지름 1 증가");
	}

	public void getAreaOfCircle(/* double PI, int radius */) {
		double area = PI * radius * radius;
		System.out.println("원의 넓이는 : " + area);

	}

	public void getSizeOfCircle() {
		double size = 2 * PI * radius;
		System.out.println("원의 둘레는 : " + size);

	}

}

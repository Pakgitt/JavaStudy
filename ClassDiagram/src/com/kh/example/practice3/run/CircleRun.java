package com.kh.example.practice3.run;

import com.kh.example.practice3.model.vo.Circle;

public class CircleRun {
	public static void main(String[] args) {
		
		Circle c = new Circle();
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		c.incrementRadius();
		c.getAreaOfCircle();
		c.getSizeOfCircle();
	}

}

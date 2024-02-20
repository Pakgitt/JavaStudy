package com.kh.example.practice4.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	public Student(int grade, int classroom, String name, double height, char gender) {
		super();
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}

	public void information() {
//		return grade + classroom + name + height + gender;
		System.out.printf("%d학년 %d반 %s %.2fcm %c자", grade, classroom, name, height, gender);
	}

}

package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class StudentRun {
	public static void main(String[] args) {

		Student st = new Student(6, 1, "박세횩", 189.2, '남');
		st.information();
	}
}

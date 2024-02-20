package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class BookRun {
	public static void main(String[] args) {
		Book bk = new Book("노인과바다", "난쟁이출판사", "박세혁");
		bk.inform();
	}
}

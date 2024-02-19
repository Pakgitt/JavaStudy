package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class MemberRun {
	public static void main(String[] args) {
		Member mb = new Member();
		mb.changeName("박세횩");
		
		mb.PrintName();
	}
}

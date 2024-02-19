package com.kh.example.practice1.model.vo;

public class Member {
	private String memberId;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;

	public Member() {

	}

	public Member(String memberId, String memberPwd, String memberName, int age, char gender, String phone,
			String email) {
		super();
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.memberName = memberName;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.email = email;
	}

	public void changeName(String name) {
		this.memberName = name;
	}

	public void PrintName() {
		System.out.println("Member name : " + memberName);

	}

}

package controllExam;

import java.util.Scanner;

public class ControllP5 {
	public void method() {

		// 아이디, 비밀번호를 정해두고 로그인 기능을 구현해라
		// 로그인 성공시 "로그인 성공", 아이디가 틀렸을 경우 "아이디가 틀렸습니다"
		// 비밀번호가 틀렸을 경우 "비밀번호가 틀렸습니다"를 출려하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("Id를 입력하세요 : ");
		String id = sc.nextLine();
		String uId = "myId";

		System.out.println("비밀번호를 입력하세요 : ");
		String pw = sc.nextLine();
		String uPw = "myPw12";

		if (id.equals(uId) && (pw.equals(uPw))) {
			System.out.println("로그인 성공");

		} else if (id.equals(uId) && !(pw.equals(uPw))) {
			System.out.println("비밀번호가 틀렸습니다");
		} else {
			System.out.println("아이디가 틀렸습니다");
		}

	}

}

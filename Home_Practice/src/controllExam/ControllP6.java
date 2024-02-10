package controllExam;

import java.util.Scanner;

public class ControllP6 {
	public void method() {

		// 사용자에게 관리자, 회원, 비회원중 하나를 입력받아 각 등급이 행할수 있는 권한을 출력하세요.
		// 단, 관리자는 회원관리, 게시글 관리, 작성, 조회, 댓글 작성이 가능하고
		// 회원은 게시글 작성, 조회, 댓글 작성이 가능하고 비회원은 게시글 조회만 가능합니다.

		Scanner sc = new Scanner(System.in);
		System.out.println("관리자, 회원, 비회원");
		System.out.println("당신의 등급을 입력하세요. : ");
		String grade = sc.nextLine();

		String admin = "관리자";
		String member = "회원";
		String bmember = "비회원";

		switch (grade) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 작성, 조회, 댓글작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("보기중에서 입력해주세요.");
			break;
		}

	}

}

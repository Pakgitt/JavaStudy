package controllExam;

import java.util.Scanner;

public class ControllP1 {
	public void method() {

		Scanner sc = new Scanner(System.in);

		System.out.println("메뉴 번호를 입력하세요. : ");
		System.out.print("1. 입력, ");
		System.out.print("2. 수정, ");
		System.out.print("3. 조회, ");
		System.out.print("4. 삭제, ");
		System.out.print("7. 종료, ");

		int option = sc.nextInt();

		switch (option) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제 메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램 종료.");
//				run = false; // run값에 false를 줘서 while문도 종료
			break;
		default:
			System.out.println("없는 메뉴입니다.");
			break;
		}

	}

}

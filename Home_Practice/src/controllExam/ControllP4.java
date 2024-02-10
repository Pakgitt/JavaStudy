package controllExam;

import java.util.Scanner;

public class ControllP4 {
	public void method() {

		// 수업자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 변환하여 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.println("월을 입력하세요 : ");
		int season = sc.nextInt();

		switch (season) {
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("월은 12월까지 있습니다.");
			break;
		}
	}

}

package controllExam;

import java.util.Scanner;

public class ControllP2 {
	public void method() {

		// 입력받은 정수가 양수이면서 짝수일 때만 "짝수다"를 출력하고
		// 짝수가 아니면 "홀수다"를 출력하세요.
		// 양수가 아니면 "양수만 입력하세요."를 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요. : ");
		int inputInt = sc.nextInt();

		if (inputInt > 0 && inputInt % 2 == 0) {
			System.out.println("짝수다");
		} else if (inputInt % 2 != 0) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요");
		}

	}

}

package controllExam;

import java.util.Scanner;

public class ControllP8 {
	public void method() {

// 두 개의 정수와 연산기호를 입력받아 연산기호에 맞춰 연산결과를 출력하세요.
// 단, 두개의 정수 모드 양수일때만 작동하면 없는 연산기호를 입력했을시 
// "잘못 입력했습니다"를 출력하세여.

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 2개를 입력하시오 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		System.out.println("연산자를 입력하시오 : ");
		char z = sc.next().charAt(0);

		int sum = x + y;
		int minus = x - y;
		int multiply = x * y;
		double divide = (double) x / y;
		double reminder = (double) x % y;

		if (x > 0 && y > 0) {

			switch (z) {
			case '+':
				System.out.println(x + "+" + y + "=" + sum);
				break;
			case '-':
				System.out.println(x + "-" + y + "=" + minus);
				break;
			case '*':
				System.out.println(x + "*" + y + "=" + multiply);
				break;
			case '/':
				System.out.printf(x + "/" + y + "=" + "%.4f", (double) divide);
				break;
			case '%':
				System.out.println(x + "%" + y + "=" + reminder);
				break;
			default:
				System.out.println("연산자를 다시 입력해주세요.");
				break;
			}
		}

	}
}
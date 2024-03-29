package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatPp12 {
	public static void main(String[] args) {

		// 정수두개와 연산자를 입력받은 후 그에 알맞은 결과를 출력
		// "exit"라는 값이 들어올때까지 무한 반복하며
		// exit가 들어오면 "프로그램 종료 출력"후 종료
		// 나누기를할때 두번째 정수가 0으로 들어오거나 없는 연산자가 들어올시 오류메시지 출력후 다시 값 입력
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("첫번째 정수 입력 : ");
			int x = sc.nextInt();

			System.out.print("두번째 정수 입력 : ");
			int y = sc.nextInt();

			System.out.print("연산자 입력(종료하려면 exit입력) : ");
			String operator = sc.next();

			int sum = x + y;
			int minus = x - y;
			int multiply = x * y;
			int divide = 0;
			int remainder = 0;

			if (y != 0) {
				divide = x / y;
				remainder = x % y;
			}

			switch (operator) {
			case "+":
				System.out.println("정수 1: " + x);
				System.out.println("정수 2: " + y);
				System.out.println(x + "+" + y + "=" + sum);
				break;
			case "-":
				System.out.println("정수 1: " + x);
				System.out.println("정수 2: " + y);
				System.out.println(x + "-" + y + "=" + minus);
				break;
			case "*":
				System.out.println("정수 1: " + x);
				System.out.println("정수 2: " + y);
				System.out.println(x + "*" + y + "=" + multiply);
				break;
			case "/":
				if (y != 0) {
					System.out.println("정수 1: " + x);
					System.out.println("정수 2: " + y);
					System.out.println(x + "/" + y + "=" + divide);
				} else {
					System.out.println("0으로 나눌수 없음. 다시 입력");

				}
				break;

			case "%":
				System.out.println("정수 1: " + x);
				System.out.println("정수 2: " + y);
				System.out.println(x + "%" + y + "=" + remainder);
				break;
			case "exit":
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("올바르지 않은 연산자입니다");
				break;
			}

		}
	}
}
package repeatEaxm;

import java.util.Scanner;

public class RepeatP2 {
	public static void main(String[] args) {

		// 위 문제와 동일하나 1 미만의 숫자가 입력되었을 시, 다시 입력하게 만들어라

		Scanner sc = new Scanner(System.in);
		int inputInt;

		do {
			System.out.println("1이상의 숫자를 입력하세요 : ");
			inputInt = sc.nextInt();

			if (inputInt < 1) {
				System.out.println("숫자 다시 입력 : ");
			}
		} while (inputInt < 1); // 조건이 참이면 다시 do문으로 실행. 거짓이면 수행문 출력.

		for (int i = 1; i <= inputInt; i++) {
			System.out.println(i);
		}

	}
}
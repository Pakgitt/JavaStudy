package repeatEaxamhard;

import java.util.Scanner;

public class repeatPhard1 {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 하나의 값이 소수인지 판별하는 프로그램을 구현하세요.
		// 단. 입력한 수가 2보다 작은경우 "잘못 입력하셨습니다"를 출력
		// 소수는 n을 1부터 n까지로 나눴을때 떨어지는 수가 1과 n뿐인 수를 말한다

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		int count = 0;

		if (num == 2) {
			System.out.println("소수다");
		} else if (num > 2) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println("소수다");
			} else {
				System.out.println("소수가 아니다");
			}

		} else {
			System.out.println("2이상의 숫자를 입력");
		}
	}
}
package repeatEaxamhard;

import java.util.Scanner;

public class repeatPhard2 {
	public static void main(String[] args) {
		// 위 문제와 모든것이 동리하나, 입력한 수가 2보다 작은경우
		// "잘못 입력하셨습니다"를 출력하고 다시 값을 넣게 해라

		Scanner sc = new Scanner(System.in);
		boolean bool = true;
		while (bool) {
			System.out.println("숫자를 입력하세요 : ");
			int num = sc.nextInt();
			int count = 0;

			if (num == 2) {
				System.out.println("소수다");
				bool = false;
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
				bool = false;

			} else {
				System.out.println("2이상의 숫자를 입력");
				bool = true;
			}
		}
	}
}
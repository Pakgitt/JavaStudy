package repeatEaxm;

import java.util.Scanner;

public class RepeatP1 {
	public static void main(String[] args) {
		// 한 개의 값을 입력받아 1부터 그 숫자까지의 숫자들을 모두 출력하시오.
		// 단, 입력한 수는 1보다 크거나 같아야 합니다
		// 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("1이상의 숫자를 입력하세요 : ");
		int inputInt = sc.nextInt();

		if (inputInt >= 1) {
			for (int i = 1; i <= inputInt; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("숫자 다시 입력(1이상) : ");
		}

	}

}
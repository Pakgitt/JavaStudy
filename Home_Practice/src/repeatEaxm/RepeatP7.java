package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatP7 {
	public static void main(String[] args) {

		// 위 문제와 동일하나, 1 미만의 숫자가 입력 됐다면
		// "1 이상의 숫자를 입력해주세요"를 출력하고 다시 값을 넣게 해라

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("첫째 숫자 입력: ");
			int x = sc.nextInt();
			System.out.println("두분째 숫자 입력");
			int y = sc.nextInt();

			if (x > 0 && y > 0) {
				if (x < y) {
					for (int i = x; i <= y; i++) {
						System.out.print(i + "\t");

					}
					break;
				} else {
					System.out.println("첫번째 숫자는 두번째 숫자보다 커야함");
				}
			} else {
				System.out.println("1이상의 숫자 입력");
			}

		}
	}
}
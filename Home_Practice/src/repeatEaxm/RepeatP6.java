package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatP6 {
	public static void main(String[] args) {

		// 사용자로부터 두 개의 값을 입력받아 그 사이의 숫자를 모두 출력하세요.
		// 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 숫자 :");
		int x = sc.nextInt();

		System.out.println("두 번째 숫자 : ");
		int y = sc.nextInt();

		if (x >= 1 && y >= 1) {
			if (x <= y) {
				for (int i = x; i <= y; i++) {
					System.out.print(i + "\t");
				}
			} else {
				System.out.println("첫 번째 숫자는 두 번째 숫자보다 작아야 합니다.");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해야 합니다.");
		}
	}
}
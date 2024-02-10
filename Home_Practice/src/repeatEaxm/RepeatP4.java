package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatP4 {
	public static void main(String[] args) {

		// 위 문제와 동일하나, 1 미만의 숫자가 입력됐다면
		// "1이상의 숫자를 입력해주세요"출력
		Scanner sc = new Scanner(System.in);
		int inputInt;

		do {
			System.out.println("1이상의 숫자를 입력해주세요.");
			inputInt = sc.nextInt();
			if (inputInt < 1) {
				System.out.println("숫자 다시 입력");
			}
		} while (inputInt < 1);

		for (int i = inputInt; i > 0; i--) {
			System.out.print(i);
		}

	}

}

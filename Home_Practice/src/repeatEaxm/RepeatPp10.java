package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatPp10 {
	public static void main(String[] args) {

		// 위 문제와 모든것이 동일하나, 9를 초과하는 숫자가 입력됐다면
		// "9이하의 숫자를 입력해주세요"가 출력되면서 다시 사용자가 값을 입력하도록 하세요

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("단을 입력하세요 : ");
			int dan = sc.nextInt();

			if (dan > 0 && dan < 10) {
				for (int i = dan; i < 10; i++) {
					System.out.println("====" + i + "단====");
					for (int j = 1; j < 10; j++) {
						System.out.println(i + "X" + j + "=" + (i * j));
					}

				}
				break;
			} else {
				System.out.println("1부터 9까지만 입력하세요.");
			}
		}
	}
}
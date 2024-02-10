package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatP8 {
	public static void main(String[] args) {

		// 입력받은 숫자의 단을 출력

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("출력받을 단을 입력하세요 : ");
			int dan = sc.nextInt();

			if (dan < 10) {
				System.out.println("====" + dan + "단====");
				for (int i = 1; i < 10; i++) {
					System.out.println(dan + "X" + i + "= " + (dan * i));
				}
				break;
			} else {
				System.out.println("구구단은 9단까지 있습니다.");
			}
		}
	}
}
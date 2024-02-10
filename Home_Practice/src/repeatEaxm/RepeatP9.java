package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatP9 {
	public static void main(String[] args) {

		// 입력받은 숫자의 단부터 9단까지 출력
		// 단, 9를 초과하는 숫자를 입력하면 에러메세지 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int dan = sc.nextInt();

		if (dan > 0 && dan < 10) {
			for (int i = dan; i < 10; i++) {
				System.out.println("====" + i + "단====");
				for (int j = 1; j < 10; j++) {

					System.out.println(i + "X" + j + "=" + (j * i));

				}
				System.out.println();
			}

		} else {
			System.out.println("1부터 9까지의 숫자만 입력");
		}
	}
}
package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatPp14 {
	public static void main(String[] args) {

		// 별표 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

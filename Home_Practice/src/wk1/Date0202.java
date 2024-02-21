package wk1;

import java.util.Scanner;

public class Date0202 {

	public static void main(String[] args) {

		System.out.print("정수 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if ((num >= 3) && (num % 2 != 0)) {
			for (int i = 0; i < (num / 2 + 1); i++) {
				System.out.print((i + 1) + ", ");
			}
			for (int i = 0; i < (num / 2 - 1); i++) {
				System.out.print((num / 2 - i) + ", ");
			}
			System.out.print(1);
		} else {
		}
	}
}
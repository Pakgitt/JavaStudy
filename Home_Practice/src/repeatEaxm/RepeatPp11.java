package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatPp11 {
	public static void main(String[] args) {

		// 시작 숫자와 공차를 입력받아 일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현하세요
		// 단 출력되는 숫자는 총 10개입니다.
		int count = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();

		System.out.println("공차 입력 : ");
		int x = sc.nextInt();
		int sum = num;

		while (count < 10) {
			System.out.print(sum + "\t");
			sum += x;
			count++;
		}

	}
}

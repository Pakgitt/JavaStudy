package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatP5 {
	public static void main(String[] args) {

		// 1부터 사용자에게 입력받은 수까지의 정수들의 합을 출력해라

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나를 입력");

		int inputInt = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= inputInt; i++) { // 합계산
			sum += i;
		}
		for (int i = 1; i < inputInt; i++) {
			System.out.print(i + "+");
		}
		System.out.println(inputInt + " = " + sum);
	}

}

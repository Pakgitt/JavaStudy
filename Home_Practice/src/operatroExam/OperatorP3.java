package operatroExam;

import java.util.Scanner;

public class OperatorP3 {
	public void method() {

		// 입력받은 정수가 짝수면 "짝수다", 짝수가 아니면 "홀수다"를 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 :");
		int inputInt = sc.nextInt();

		System.out.println(inputInt % 2 == 0 ? "짝수다" : "홀수다");

	}
}

package operatroExam;

import java.util.Scanner;

public class OperatorP1 {
	public void method() {

		// 입력받은 하나의 정수가 양수면 "양수다" 그렇지 아니면 "양수가 아니다"를 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 하나를 입력하세요 :");

		int inputInt = sc.nextInt();
		System.out.println(inputInt > 0 ? "양수다" : "양수가 아니다");
	}

}

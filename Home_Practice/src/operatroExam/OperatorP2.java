package operatroExam;

import java.util.Scanner;

public class OperatorP2 {
	public void method() {

		// 입력받은 하나의 정수가 양수이면 "양수다",
		// 양수가 아닌경우 중에서 0이면 "0이다", 0이 아니면 "음수다"를 출력해라.
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 하나를 입력하세요 :");
		int inputInt = sc.nextInt();

		System.out.println((inputInt > 0) ? "양수다" : ((inputInt == 0) ? "0이다" : "음수다"));

	}
}

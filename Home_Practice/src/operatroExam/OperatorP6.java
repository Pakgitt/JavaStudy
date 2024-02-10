package operatroExam;

import java.util.Scanner;

public class OperatorP6 {
	public void method() {

		// 나이를 입력받아 어린이(13세 이후)인지, 청소년(13세 초과 ~ 19세 이하)인지,
		// 성인(19세 초과)인지 출력하세요

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력하세요 :");
		int age = sc.nextInt();

		System.out.println((age <= 13) ? "어린이" : (age > 13 && age <= 19) ? "청소년" : "성인");
		// System.out.println((inputInt > 0) ? "양수다" : ((inputInt == 0) ? "0이다" :
		// "음수다"));age > 13 && age < 19
	}
}

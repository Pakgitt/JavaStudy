package operatroExam;

import java.util.Scanner;

public class OperatorP8 {
	public void method() {

		// 주민번호를 이용해 남자인지 여자인지 구분하여 출력하시오.

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.(- 포함)");
		char num = sc.next().charAt(7);

//		System.out.println(num);
		System.out.println((num == '3') ? "남자" : "여자");

	}
}
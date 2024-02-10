package variableExam;

import java.util.Scanner;

public class VariableP2 {
	public void method() {
		// 키보드로 정수 두 개를 입력받아 두 수의 합, 차, 곱 나누기한 몫을 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 정수를 입력해주세요. : ");
		int a = sc.nextInt();

		System.out.println("두 번째 정수를 입력해주세요. : ");
		int b = sc.nextInt();

		System.out.println("더하기 결과 : " + (a + b));
		System.out.println("빼기 결과 : " + (a - b));
		System.out.println("곱하기 결과 : " + (a * b));
		System.out.println("나누기 몫 결과 : " + (a / b));

	}
}

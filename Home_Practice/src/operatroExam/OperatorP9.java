package operatroExam;

import java.util.Scanner;

public class OperatorP9 {
	public void method() {

		// 정수 두개를 입력받아 각각 변수(num1, num2)에 저장하세요.
		// 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 T,
		// 아니면 F를 출력하시오.(단, num1은 num2보다 작아야함)
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 정수를 입력하세요. : ");
		int num1 = sc.nextInt();

		System.out.print("두 번째 정수를 입력하세요.(첫 번째 정수보다 커야함) : ");
		int num2 = sc.nextInt();

		System.out.print("마지막 정수를 입력하세요. : ");
		int x = sc.nextInt();

		System.out.println(x <= num1 || x > num2 ? 'T' : 'F');
	}
}
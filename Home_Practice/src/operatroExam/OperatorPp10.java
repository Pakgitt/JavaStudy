package operatroExam;

import java.util.Scanner;

public class OperatorPp10 {
	public void method() {
		// 3개의 수를 입력받아 입력 받은 수가 모두 같으면 T, 아니면 F

		Scanner sc = new Scanner(System.in);

		System.out.println("입력1 : ");
		int inputInt1 = sc.nextInt();

		System.out.println("입력2 : ");
		int inputInt2 = sc.nextInt();

		System.out.println("입력3 : ");
		int inputInt3 = sc.nextInt();

		boolean result = (inputInt1 == inputInt2) && (inputInt1 == inputInt3);

		System.out.println(result ? 'T' : 'F');

	}
}
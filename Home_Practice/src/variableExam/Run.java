package variableExam;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("풀어볼 문제를 고르시오 : ");

		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			new VariableP1().method();
			break;
		case 2:
			new VariableP2().method();
			break;
		case 3:
			new VariableP3().method();
			break;
		case 4:
			new VariableP4().method();
			break;
		default:
			System.out.println("문제는 4번까지 있습니다");
			break;
		}

	}
}

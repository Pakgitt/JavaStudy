package variableExam;

import java.util.Scanner;

public class VariableP3 {
	public void method() {

		// 가로, 세로 값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하시오.

		Scanner sc = new Scanner(System.in);

		System.out.println("가로 값을 입력하시오 : ");
		float x = sc.nextFloat();

		System.out.println("세로 값을 입력하시오 : ");
		float y = sc.nextFloat();

		System.out.println("면적 : " + (x * y));
		System.out.println("둘레 : " + (x + y) * 2);
	}
}

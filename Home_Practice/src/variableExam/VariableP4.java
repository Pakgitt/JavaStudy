package variableExam;

import java.util.Scanner;

public class VariableP4 {
	public void method() {

		// 영어 문자열 값을입력 받아 문자에서 앞에서 세 개를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("영단어를 입력하세요 : ");
		String inputStr = sc.next();
		System.out.println(inputStr);

		System.out.println("첫 번째 문자 : " + inputStr.charAt(0));
		System.out.println("두 번째 문자 : " + inputStr.charAt(1));
		System.out.println("세 번째 문자 : " + inputStr.charAt(2));
		System.out.println("네 번째 문자 : " + inputStr.charAt(3));

	}
}

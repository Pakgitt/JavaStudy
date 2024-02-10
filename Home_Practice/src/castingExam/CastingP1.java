package castingExam;

import java.util.Scanner;

public class CastingP1 {
	public static void main(String[] args) {
		// 문자 하나를 입력받아 그 문자의 유니코드를 출력하세요.
		Scanner sc = new Scanner(System.in);

		System.out.println("문자 하나를 입력하세요 : ");
		char inputChar = sc.next().charAt(0);

		int uni = (int) inputChar;

		System.out.println(uni);

	}

}

package arrayExam;

import java.util.Scanner;

public class ArrayPp15 {
	public static void main(String[] args) {

		// 문자열을 입력받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		// 문자의 개수와 함께 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요 : ");
		String inputstr = sc.nextLine();

		char[] arrCh = inputstr.toCharArray(); // String을 char배열 형태로 변환

		for (char c : arrCh) {
			System.out.print(c + ",");
		}
		System.out.println();
		System.out.println(arrCh.length);

	}

}

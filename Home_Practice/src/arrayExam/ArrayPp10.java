package arrayExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPp10 {
	public static void main(String[] args) {

		// 주민등록번호 성별자리 이후부터 *로 가리고 출력
		// 단, 원본 배열 값은 변경없이 배열 복사본으로 변경

		char[] arr = new char[14];
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호(-포함) : ");
		String num = sc.nextLine();

		for (int i = 0; i < 14; i++) {
			arr[i] = num.charAt(i);
		}
		for (int i = 8; i < 14; i++) {
			arr[i] = '*';
		}
		System.out.println(String.valueOf(arr));
	}
}

package arrayExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayP6 {
	public static void main(String[] args) {

		// 월~일 까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력받아
		// 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
		// 범위에 없는 숫자를 입력 시 "잘못 입력하셨습니다"를 출력하시오

		Scanner sc = new Scanner(System.in);

		String[] arr = new String[] { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		boolean run = true;
		while (run) {
			System.out.println("0~6 숫자 입력 : ");
			int inputInt = sc.nextInt();

			if (inputInt >= 0 && inputInt <= 6) {
				System.out.println(arr[inputInt]);
				run = false;
			} else {
				System.out.println("0부터 6까지 다시 입력 : ");
			}
		}
		sc.close();
	}
}

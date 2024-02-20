package arrayExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayP5 {
	public static void main(String[] args) {

		// 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요

		Scanner sc = new Scanner(System.in);

		System.out.println("문자열 입력 : ");
		String inputStr = sc.nextLine();
		char[] arr = new char[inputStr.length()]; // inputStr크기의 배열 생성
		for (int i = 0; i < inputStr.length(); i++) {
			arr[i] = inputStr.charAt(i);
		}
		System.out.println(Arrays.toString(arr)); // 배열로 표현

		System.out.println("찾을 문자 입력 : ");
		char inputCh = sc.nextLine().charAt(0);

		int count = 0; // 찾을 문자의 개수를 저장할 변수
		for (int i = 0; i < inputStr.length(); i++) {
			if (arr[i] == inputCh) {
				System.out.println(inputStr + "에 " + inputCh + "가 존재하는 위치 :" + (i + 1));
				count++;

			}
		}
		if (count == 0) {
			System.out.println("그런 문자 없어;");
		} else {
			System.out.println(inputCh + "는" + count + "개 존재 합니다");
		}

	}
}

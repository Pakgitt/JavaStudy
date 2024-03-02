package arrayExam;

import java.util.Scanner;

public class ArrayPp16 {
	public static void main(String[] args) {

		// 입력받은 길이만큼 문자열 배열을 선언 및 할당하고
		// 배열의 인덱스에 넣을 값 역시 사용자가 입력하여 초기화 해라
		// 단, 사용자에게 배열에 값을 더 넣을지 물어보고 몇 개를 더 입력할 건지,
		// 늘린 곳에 어떤 데이터를 넣을 것인지 받으세요
		// 사용자가 더 이상 입력하지 않겠다고 하면 배열 전체 값을 출력하세요.

		// TODO 미완성 (추가)

		Scanner sc = new Scanner(System.in);

		System.out.println("배열의 크기를 입력 : ");
		int arrSize = sc.nextInt();
		String[] arrStr = new String[arrSize];
		for (int i = 0; i < arrSize; i++) {
			System.out.println((i + 1) + "번째 문자열");
			arrStr[i] = sc.next();
		}
		for (String i : arrStr) {
			System.out.print(i + " ");
		}
	}
}

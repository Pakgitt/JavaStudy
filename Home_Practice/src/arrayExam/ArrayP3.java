package arrayExam;

import java.util.Scanner;

public class ArrayP3 {
	public static void main(String[] args) {

		// 입력받은 양의 정수만큼 배열 크기를 할당하고
		// 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수");
		int inputInt = sc.nextInt();

		int[] num = new int[inputInt];
		System.out.println("양의 정수" + inputInt);
		for (int i = 1; i <= num.length; i++) {
			System.out.print(i + "\t");
		}

	}
}

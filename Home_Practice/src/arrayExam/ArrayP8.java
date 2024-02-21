package arrayExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayP8 {
	public static void main(String[] args) {

		// 3이상인 홀수 자연수를 입력받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요
		// 단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 "다시 입력하세요"를 출력하고
		// 다시 정수를 받으세요

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int inputInt = sc.nextInt();
		int[] arr = new int[inputInt];
		if (inputInt >= 3 && !(inputInt % 2 == 0)) {
			for (int i = 0; i < arr.length / 2 + 1; i++) {
				arr[i] = i + 1;

			}
			for (int j = arr.length / 2 + 1; j < arr.length; j++) {
				arr[j] = arr.length - j;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}

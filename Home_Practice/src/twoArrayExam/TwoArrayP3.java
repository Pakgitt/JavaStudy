package twoArrayExam;

import java.util.Iterator;

public class TwoArrayP3 {
	public static void main(String[] args) {

		// 4행 4열짜리 정수형 배열을 선언 및 할당하고
		// 1) 16~1까지 값을 거꾸로 저장
		// 2) 저장된 값들을 차례대로 출력

		int[][] arr = new int[4][4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = 4 * (4 - i) - j;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

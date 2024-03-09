package twoArrayExam;

import java.util.Random;
import java.util.Scanner;

public class TwoArrayP7 {
	public static void main(String[] args) {

		// 사용자에게 행의 크기를 입력받고 그 수만큼의 반복을 통해
		// 열의 크기도 받아 문자형 가변 배열을 선언 및 할당해라
		// 그리고 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		int[][] arr = null;

		System.out.println("행 크기 입력 : ");
		int row = sc.nextInt();
		arr = new int[row][];

		for (int i = 0; i < row; i++) {
			System.out.println("열 크기 입력");
			int col = sc.nextInt();
			arr[i] = new int[col];

			for (int j = 0; j < col; j++) {
				arr[i][j] = rd.nextInt(26) + 65;
				System.out.println((char)arr[i][j] + " ");
			}
		}
		System.out.println();
	}

}

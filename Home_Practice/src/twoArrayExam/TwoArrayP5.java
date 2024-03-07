package twoArrayExam;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class TwoArrayP5 {
	public static void main(String[] args) {

		// 2차원 배열의 행과 열의 크기를 사용자에게 입력받되,
		// 1~10사이의 정수가 아니면 다시 입력받아라
		// 크기가 정해진 2차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력
		// char형은 숫자를 더해 문자를 표현할 수 있고 65 = A

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("행 입력 : ");
		int row = sc.nextInt();
		sc.nextLine();
		System.out.println("열 입력 : ");
		int col = sc.nextInt();
		sc.nextLine();

		int[][] arr = new int[row][col];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rd.nextInt(26) + 65;
				System.out.print((char) arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

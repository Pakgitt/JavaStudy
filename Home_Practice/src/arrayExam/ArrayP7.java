package arrayExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayP7 {
	public static void main(String[] args) {

		// 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 해라
		// 그리고 배열 전체의 값을나열하고 각 인덱스에 저장된 값들의 합을 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 : ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + "번 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총 합 : " + sum);
	}
}

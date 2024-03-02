package arrayExam;

import java.util.Random;

public class ArrayPp12 {
	public static void main(String[] args) {

		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생시켜 배열에 초기화 후
		// 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력
		Random random = new Random();
		int[] arrint = new int[10];

		for (int i = 0; i < 10; i++) {
			arrint[i] = random.nextInt(10) + 1; // 1부터 10까지 난수 생성
		}
		// 배열 전체 값 출력
		for (int i = 0; i < 10; i++) {
			System.out.print(arrint[i] + " ");
		}
		int max = arrint[0];
		int min = arrint[0];

		for (int i = 0; i < 10; i++) {
			if (arrint[i] > max) {
				max = arrint[i];
			}
			if (arrint[i] < min) {
				min = arrint[i];
			}
		}
		System.out.println();
		System.out.println("최댓값 : " + max);
		System.out.println("최소값 : " + min);
	}
}

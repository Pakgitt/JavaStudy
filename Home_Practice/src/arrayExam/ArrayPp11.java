package arrayExam;

import java.util.Random;

public class ArrayPp11 {
	public static void main(String[] args) {

		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생 시켜 배열에 초기화 한 후 출력하세요.
		Random random = new Random();

		int[] arrint = new int[10];

		for (int i = 0; i < 10; i++) {
			arrint[i] = random.nextInt(10) + 1; // 1부터 10까지
			System.out.print(arrint[i] + " ");
		}
	}
}

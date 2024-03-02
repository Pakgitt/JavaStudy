package arrayExam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPp13 {
	public static void main(String[] args) {

		// 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		// 1~10 사이의 난수를 발생 시켜 중복값 없이 배열에 초기화한 후 출력

		Random random = new Random();

		int[] arrint = new int[10];

		for (int i = 0; i < 10; i++) {
			arrint[i] = random.nextInt(10) + 1;
			for (int j = 0; j < i; j++) {
				if (arrint[i] == arrint[j]) { // 중복시 i 1감소시켜 다시 진행
					i--;
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arrint[i] + " ");
		}
	}
}

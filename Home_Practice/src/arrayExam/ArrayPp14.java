package arrayExam;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPp14 {
	public static void main(String[] args) {

		// 로또 번호 자동 생성기 프로그램을 작성하는데
		// 중복 값 없이 오름차순으로 정렬 후 출력

		Random random = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
				}
			}
		}

		Arrays.sort(lotto); // 오름차순 정렬
		for (int i : lotto) {
			System.out.print(i + " ");
		}
//		for (int i = 0; i < lotto.length; i++) {
//			System.out.print(lotto[i] + " ");
//		}

	}

}

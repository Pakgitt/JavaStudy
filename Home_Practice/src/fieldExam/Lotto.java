package fieldExam;

import java.util.Random;

public class Lotto {

	private int[] lotto = new int[6]; // 초기화 블럭 사용, 중복하지 않는 1~45까지의 난수들로 6개 초기화

	public Lotto() {
	}

	public void information() {
		for (int i = 0; i < lotto.length; i++) {
//			Random rd = new Random();
//			lotto[i] =  rd.nextInt(); //
			lotto[i] = new Random().nextInt(45);
			// 중복 제거
			for(int j=0;j<i;j++) {
				if(lotto[i] == lotto[j]) {
					i--;
				}
			}
			System.out.println(lotto[i]);
		}
	}

}

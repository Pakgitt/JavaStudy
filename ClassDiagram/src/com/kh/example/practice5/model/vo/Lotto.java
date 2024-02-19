package com.kh.example.practice5.model.vo;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int[] lotto;

	public Lotto() {
		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = new Random().nextInt(45);
		}
	}

	public void information() {
		System.out.println(Arrays.toString(lotto));
	}

}

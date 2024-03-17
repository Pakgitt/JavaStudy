package test;

import java.util.Scanner;

public class JdbcTest {
	public static void main(String[] args) {

		// 구구단
//		for (int i = 1; i < 10; i++) {
//			System.out.println(i + "단");
//			for (int j = 1; j < 10; j++) {
//				System.out.println(i + "X" + j + "=" + i * j);
//			}
//			System.out.println();
//		}
//		System.out.println();

		// 3의 약수 찾기
//		System.out.println("숫자를 입력하세요");
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		if(num%3==0 && num>0) {
//			System.out.println("3의 약수입니다");
//		}else {
//			System.out.println("3의 약수가 아닙니다");
//		}

		int num = 10;
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}
			sum += i;
		}
		System.out.println("1부터 10까지의 짝수 합 " + sum);
	}
}

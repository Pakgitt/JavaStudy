package wk1;

import java.util.Scanner;

import java.util.Iterator;
import java.util.Scanner;

public class Date0202 {

	public static void main(String[] args) {

		String[] day = new String[] { "월", "화", "수", "목", "금", "토", "일" };
		System.out.println("0~6사이 숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch (num) {
		case 0:
			System.out.println(day[0] + "요일");
			break;
		case 1:
			System.out.println(day[1] + "요일");
			break;
		case 2:
			System.out.println(day[2] + "요일");
			break;
		case 3:
			System.out.println(day[3] + "요일");
			break;
		case 4:
			System.out.println(day[4] + "요일");
			break;
		case 5:
			System.out.println(day[5] + "요일");
			break;
		case 6:
			System.out.println(day[6] + "요일");
			break;

		default:
			System.out.println("잘못 입력하셨습니다");
			break;
		}

	}
}
package repeatEaxm;

import java.util.Iterator;
import java.util.Scanner;

public class RepeatP3 {
	public static void main(String[] args) {

		// 한개의 값을 입력받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하시오
		// 단 입력한 숫자는 1보다 크거나 같아야함

		Scanner sc = new Scanner(System.in);
		System.out.println("1 이상의 숫자를 입력 : ");
		int inputInt = sc.nextInt();

		if (inputInt >= 1) {
			for (int i = inputInt; i > 0; i--) {
				System.out.println(i);
			}

		} else {
			System.out.println("숫자 잘못 입력");
		}

	}

}

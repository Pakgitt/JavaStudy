package test;

import java.util.Scanner;

public class JdbcTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("배열의 크기를 입력 : ");
		int arrSize = sc.nextInt();
		sc.nextLine(); // 엔터를 소비하기 위해 추가적인 nextLine() 호출

		String[] arrStr = new String[arrSize];

		do {
			for (int i = 0; i < arrSize; i++) {
				System.out.println((i + 1) + "번째 문자열 : ");
				arrStr[i] = sc.nextLine();
			}

			System.out.println("값을 더 입력하겠습니까?(Y/N) : ");
			char add = sc.next().charAt(0);
			sc.nextLine();

			if (add != 'Y' && add != 'y') {
				break;
			}

			System.out.println("더 입력하고 싶은 개수 : ");
			int addSize = sc.nextInt();
			sc.nextLine(); // 엔터를 소비하기 위해 추가적인 nextLine() 호출

			// 배열 크기 확장
			String[] newArrStr = new String[arrSize + addSize];

			// 기존 배열 값을 새로운 배열에 복사
			System.arraycopy(arrStr, 0, newArrStr, 0, arrSize);

			// 추가로 입력받은 값을 새로운 배열에 넣기
			for (int i = arrSize; i < arrSize + addSize; i++) {
				System.out.println((i + 1) + "번째 문자열 : ");
				newArrStr[i] = sc.nextLine();
			}

			// 새로운 배열로 교체
			arrStr = newArrStr;
			arrSize += addSize;

		} while (true);

		for (String i : arrStr) {
			System.out.print(i + " ");
		}
	}
}

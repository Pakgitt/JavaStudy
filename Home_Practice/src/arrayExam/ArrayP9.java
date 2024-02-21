package arrayExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayP9 {
	public static void main(String[] args) {

		// 사용자가 입력한 값이 배열에 있는지 검색하여 있으면 "xx 배달 가능"
		// 없으면 "xx은 없는 메뉴입니다"를 출력
		// 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요

		String[] chicken = { "교촌", "네네", "처갓집", "후참잘" };
		Scanner sc = new Scanner(System.in);
		System.out.println("치킨집 이름을 입력하세요 : ");
		String name = sc.nextLine();

		boolean run = false;

		for (String ck : chicken) {
			if (name.equals(ck)) {
//				System.out.println(ck + " 배달 가능");
				run = true;
				break;
			}

		}
		if (run) {
			System.out.println(name + " 배달 가능");
		} else {
			System.out.println(name + " 배달 불가능");
		}

	}
}

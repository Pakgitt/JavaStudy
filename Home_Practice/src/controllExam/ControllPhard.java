package controllExam;

import java.util.Scanner;

public class ControllPhard {
	public void method() {

		// 정수를 이용해 4자리 비밀번호를 만들려함
		// 이 때 4자리 정수를 입력받아 각 자리 수에 중복되는 값이 없을 경우"생성 성공",
		// 중복 값이 있으면 "중복 값 있음", 자리수가 안맞으면 "자리 수 안맞음" 출력
		// 단, 제일 앞자리 수의 값은 1~9 사이 정수

		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호 입력(1000~9999) : ");
		int pw = sc.nextInt();
		// 입력받은 정수를 문자열로 변환
		String pwString = String.valueOf(pw);

		// 자리수가 4자리인지 확인
		if (pwString.length() != 4) {
			System.out.println("자리수 안맞음");
			return;
		}
		// 중복되는값 있는지 확인
		boolean dup = (pwString.charAt(0) == pwString.charAt(1) && pwString.charAt(1) == pwString.charAt(2)
				&& pwString.charAt(2) == pwString.charAt(3));
		if (dup) {
			System.out.println("중복값 있음");
//		} else if (pwString.charAt(0) < 1 && pwString.charAt(0) > 9) {
//			System.out.println("1~9 사이의 정수를 입력해주세요.");
		} else {
			System.out.println("생성 성공");
		}

	}
}
// 해결못함
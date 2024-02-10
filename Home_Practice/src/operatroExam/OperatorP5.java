package operatroExam;

import java.util.Scanner;

public class OperatorP5 {
	public void method() {

		// 입력받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인후
		// 이 때 성별이 'M'이면 남학생, 'M'이 아니면 여학생으로 출력

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요 :");
		String name = sc.next();

		System.out.println("학년을 입력하세요(숫자만) :");
		int lev = sc.nextInt();

		System.out.println("반을 입력하세요(숫자만) :");
		int cal = sc.nextInt();

		System.out.println("번호를 입력하세요(숫자만) :");
		int num = sc.nextInt();

		System.out.println("성별(M/F) :");
		char gender = sc.next().charAt(0);

		System.out.println("성적을 입력하세요(소수점 아래 둘째자리까지) :");
		float grade = sc.nextFloat();

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", lev, cal, num, name, (gender == 'M' ? "남학생" : "여학생"),
				grade);
//		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", lev, cal, num, name, (gender == 'M' ? "남학생" : "여학생"), grade);

	}
}

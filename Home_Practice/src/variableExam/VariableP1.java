package variableExam;

import java.util.Scanner;

public class VariableP1 {
	public void method() {
//		System.out.println("run에서 method1 실행");
//		 이름, 성별 나이, 키를 사용자에게 입력받아 출력
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요 : ");
		String name = sc.next();

		System.out.println("성별을 입력하세요(남/여) : ");
		String gen = sc.next();

		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();

		System.out.println("키를 입력하세요 : ");
		float hei = sc.nextFloat();

		System.out.println("키 " + hei + "cm인 " + age + "살 " + gen + "자 " + name + "님 반갑습니다.");
		System.out.printf("키 %.2fcm인 %d살 %s자 %s님 반갑습니다.", hei, age, gen, name);
	}
}

package wk1;

import java.util.Scanner;

public class Date0202 {
	public static void main(String[] args) {
		// 이름 성별, 나이, 키를 사용자에게 입력 받아 가각의 값을 변수에 담고 출력하세요.
		System.out.println("이름을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("성별을 입력하세요(남/여) : ");
		Scanner sc1 = new Scanner(System.in);
		String gender = sc1.nextLine();
		
		System.out.println("나이를 입력하세요 : ");
		Scanner sc3 = new Scanner(System.in);
		int age = sc3.nextInt();
		
		System.out.println("키를 입력하세요 : ");
		Scanner sc4 = new Scanner(System.in);
		double height = sc4.nextDouble();
		
//		System.out.println("키 " + height + "인 " + age +"살 " + gender+"자 "
//							+ name + "님 반갑습니다^^");
		System.out.printf("키 %2f.인 %d살 %s자 %s님 반갑습니다^^", height, age, gender, name);
		
		
	}

}

package controllExam;

import java.util.Scanner;

public class ControllP3 {
	public void method() {

		// 국,영,수 세 과목의 점수를 입력받고 합계와 평균을 계산하고
		// 합계와 평균을 이용해 합격/불합격 처리하는 기능을 구현하세요
		// (합격조건 : 세 과목의 점수가 각각 40점 이상 면서 평균이 60점 이상일경우)
		// 합격시 과목별 점수와 합계, 평균, "축하합니다"를 출력하고,
		// 불합격일 경우 "불합격입니다"를 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 : ");
		int kor = sc.nextInt();

		System.out.println("영어 : ");
		int eng = sc.nextInt();

		System.out.println("수학 : ");
		int math = sc.nextInt();

		int sum = (kor + eng + math);
		float avg = (sum / 3);

		if ((kor >= 40 & eng >= 40 & math >= 40) && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + eng);
			System.out.println("영어 : " + math);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다");
		} else {
			System.out.println("불합격입니다");
		}
	}

}

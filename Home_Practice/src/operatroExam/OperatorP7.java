package operatroExam;

import java.util.Scanner;

public class OperatorP7 {
	public void method() {

		// 국어, 영어, 수학 점수를 정수로 입력받고,
		// 세 과목에 대한 합계와 평균을 구하세요.
		// 세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
		// 세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일때 합격, 그외에는 불합격을 출력하시오.

		Scanner sc = new Scanner(System.in);

		System.out.println("국어 :");
		int kor = sc.nextInt();

		System.out.println("영어 :");
		int eng = sc.nextInt();

		System.out.println("수학 :");
		int math = sc.nextInt();

		int sum = (kor + eng + math);
		float avg = (sum / 3);

		System.out.println("합계 :" + sum);
		System.out.println("평균 :" + avg);
		System.out.println(kor >= 40 & eng >= 40 & math >= 40 && avg >= 60 ? "합격" : "불합격");

	}
}

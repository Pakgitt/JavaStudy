package castingExam;

import java.util.Scanner;

public class CastingP2 {
	public static void main(String[] args) {
		// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 출력하시오.
		// 이 때 총점과 평균은 정수형으로 처리하세요.

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하시오 :");
		float kor = sc.nextFloat();

		System.out.println("영어 점수를 입력하시오 :");
		float eng = sc.nextFloat();

		System.out.println("수학 점수를 입력하시오 :");
		float math = sc.nextFloat();

		int sum = (int) (kor + eng + math);
		int avg = (int) ((kor + eng + math) / 3);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}

}

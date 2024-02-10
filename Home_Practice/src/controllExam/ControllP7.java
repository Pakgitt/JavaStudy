package controllExam;

import java.util.Scanner;

public class ControllP7 {
	public void method() {

		// 키, 몸무게를 double로 입력받고 BMI지수를 계산하여 계산 결과에 따라
		// 저체중/정상체중/과체중/비만을 출력하세요
		// BMI = 몸무게/(키(m) * 키(m)
		// BMI가 18.5미만일 경우 저체중 / 18.5이상일 경우 정상체중
		// BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		// BMI가 30이상일 경우 고도 비만

		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요(m) : ");
		double height = sc.nextDouble();

		System.out.println("몸무게를 입력하세요(kg) : ");
		double weight = sc.nextDouble();

		double bmi = weight / (height * height);

		if (bmi < 18.5) {
			System.out.println("BMI 지수 : " + (float) bmi);
			System.out.println("저체중");

		} else if (bmi >= 18.5 && bmi < 23) {
			System.out.println("BMI 지수 : " + (float) bmi);
			System.out.println("정상체중");

		} else if (bmi >= 23 && bmi < 25) {
			System.out.println("BMI 지수 : " + (float) bmi);
			System.out.println("과체중");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("BMI 지수 : " + (float) bmi);
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}

	}

}

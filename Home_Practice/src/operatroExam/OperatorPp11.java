package operatroExam;

import java.util.Scanner;

public class OperatorPp11 {
	public void method() {
		// A, B, C 사원의 연봉을 입력받고 각 사원의 연봉과 인센티브를 포함한 연봉을 계산하여 출력,
		// 인센티브포함 급여가 3000만원 이상이면 "3000 이상", 미만이면 "3000만원 미만"을 출력하시오.
		// (A 사원의 인센은 0.4, B 사원의 인센은 없으며, C 사원의 인센은 0.15)

		Scanner sc = new Scanner(System.in);

		System.out.println("A 사원의 연봉 : ");
		int a = sc.nextInt();

		System.out.println("B 사원의 연봉 : ");
		int b = sc.nextInt();

		System.out.println("C 사원의 연봉 : ");
		int c = sc.nextInt();

		float asum = (a + (a * 0.4f));
		float bsum = (b + (b * 0.0f));
		float csum = (c + (c * 0.15f));

		System.out.println("A사원 연봉/연봉 +a : " + a + "/" + asum);
		System.out.println(asum >= 3000 ? "3000이상" : "3000미만");
		System.out.println("B사원 연봉/연봉 +a : " + b + "/" + bsum);
		System.out.println(bsum >= 3000 ? "3000이상" : "3000미만");
		System.out.println("C사원 연봉/연봉 +a : " + c + "/" + csum);
		System.out.println(csum >= 3000 ? "3000이상" : "3000미만");
	}
}
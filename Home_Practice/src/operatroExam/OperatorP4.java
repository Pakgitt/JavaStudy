package operatroExam;

import java.util.Scanner;

public class OperatorP4 {
	public void method() {
		
		// 모든 사람이 사탕을 나눠가지려고 한다. 인원 수와 사탕 개수를 입력받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕 개수를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("인원 수 :");
		int peo = sc.nextInt();
		
		System.out.println("사탕 개수 :");
		int candy = sc.nextInt();
		
		int one = (candy / peo); // '/'는 몫을 구함
		int re = (candy % peo); // '%' 나머지를 구함

		System.out.println("1인당 사탕 개수 :" + one);
		System.out.println("남은 사탕 개수 :" + re);

	}
}

package arrayExam;

import java.util.Scanner;

public class ArrayP6 {
	public static void main(String[] args) {

		// 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		// 개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 : ");
		String inputStr = sc.next();
		System.out.println("n문자 위치");
		char n = sc.next().charAt(0);
		
		System.out.println(inputStr+"에 " +n+"이 존재하는 위치 : " + inputStr.charAt(n) );
	}
}

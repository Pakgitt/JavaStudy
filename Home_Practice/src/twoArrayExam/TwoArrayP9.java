package twoArrayExam;

import java.util.Arrays;
import java.util.Scanner;

public class TwoArrayP9 {
	public static void main(String[] args) {

		// 1차원 배열에 12명의 학생들을 출석부 순으로 초기화 하고
		// 2열 3행 2차원 배열 2개를 이용해 분단을 나눠
		// 1분단 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리를 배치하세요
//		<출석부>
//		1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
//		7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		// 학생 이름을 검색하여 해당 학생이 어느자리에 앉았는지 출력
		Scanner sc = new Scanner(System.in);
		String[] arrStudent = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축",
				"피풍표", "홍하하" };

		for (int i = 0; i < arrStudent.length; i++) {
			System.out.print((i + 1) + arrStudent[i] + " ");
		}
		System.out.println();
		System.out.println("=== 1분단 ===");

		String[][] g1 = new String[3][2];
		for (int i = 0; i < g1.length; i++) {
			for (int j = 0; j < g1[2].length; j++) {
				g1[i][j] = arrStudent[2 * i + j];
				System.out.print(g1[i][j] + " ");
			}
			System.out.println();

		}
		String[][] g2 = new String[3][2];
		System.out.println("=== 2분단 ===");
		for (int i = 0; i < g1.length; i++) {
			for (int j = 0; j < g1[2].length; j++) {
				g2[i][j] = arrStudent[6 + 2 * i + j];
				System.out.print(g1[i][j] + " ");
			}
			System.out.println();
		}
		// TODO
		System.out.println("학생 이름 : ");
		String sName = sc.nextLine();
		if (sName.equals(g1) || sName.equals(g2)) {
			for (int i = 0; i < g2.length; i++) {
				for (int j = 0; j < g2.length; j++) {
					System.out.println(Arrays.asList(arrStudent).indexOf(sName));

				}

			}
		}
	}

}

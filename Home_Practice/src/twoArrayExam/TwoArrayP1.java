package twoArrayExam;

public class TwoArrayP1 {
	public static void main(String[] args) {

		// 3행 3열짜리 문자열 배열을 선언 및 할당하고
		// 인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여"(0,0)"과 같은 형식으로 저장후 출력

		String[][] arr = new String[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = "(" + i + "," + j + ")";
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}

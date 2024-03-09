package twoArrayExam;

public class TwoArrayP4 {
	public static void main(String[] args) {

		// 4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는
		// 1~10까지의 임의의 정수 값 저장 후 아래 내용처럼 처리

		int[][] arr = new int[4][4];
		arr[0][0] = 6;
		arr[0][1] = 6;
		arr[0][2] = 1;

		arr[1][0] = 4;
		arr[1][1] = 10;
		arr[1][2] = 8;

		arr[2][0] = 8;
		arr[2][1] = 6;
		arr[2][2] = 5;

		int sum03 = 0;
		int sum13 = 0;
		int sum23 = 0;
		int sum30 = 0;
		int sum31 = 0;
		int sum32 = 0;
		int sum33 = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			sum03 += arr[0][i];
			arr[0][3] = sum03;

			sum13 += arr[1][i];
			arr[1][3] = sum13;

			sum23 += arr[2][i];
			arr[2][3] = sum23;

			sum30 += arr[i][0];
			arr[3][0] = sum30;

			sum31 += arr[i][1];
			arr[3][1] = sum31;

			sum32 += arr[i][2];
			arr[3][2] = sum32;

		}
		for (int j = 0; j < 3; j++) {
			sum33 += arr[3][j] + arr[j][3];
			arr[3][3] = sum33;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}

package controllExam;

import java.util.Scanner;

public class ControllP9 {
	public void method() {

		// 사용자로부터 중간, 기말, 과제, 출석 정보를 입력받는다.
		Scanner scanner = new Scanner(System.in);

		System.out.println("중간고사 점수: ");
		double midtermScore = scanner.nextDouble();

		System.out.println("기말고사 점수: ");
		double finalScore = scanner.nextDouble();

		System.out.println("과제 점수: ");
		double assignmentScore = scanner.nextDouble();

		System.out.println("출석 회수: ");
		int attendanceCount = scanner.nextInt();

		int totalLectureCount = 20; // 총 강의회수 20

		// 각 항목의 평가 비율
		double midtermWeight = 0.2;
		double finalWeight = 0.3;
		double assignmentWeight = 0.3;
		double attendanceWeight = 0.2;

		// 출석 비율 계산
		double attendanceRate = (double) attendanceCount / totalLectureCount * 100;

		// 각 항목의 가중 평균으로 총점을 계산
		double totalScore = midtermScore * midtermWeight + finalScore * finalWeight + assignmentScore * assignmentWeight
				+ attendanceRate * attendanceWeight;

		// 각 항목의 가중 평균을 출력
		System.out.println("중간고사 점수: " + midtermScore * midtermWeight);
		System.out.println("기말고사 점수: " + finalScore * finalWeight);
		System.out.println("과제 점수: " + assignmentScore * assignmentWeight);
		System.out.println("출석 점수: " + attendanceRate * attendanceWeight);

		// 총점과 Pass/Fail 여부를 출력
		System.out.println("총점: " + totalScore);

		if (totalScore >= 70) {
			System.out.println("Pass");
		} else if (totalScore < 70) {
			System.out.println("Fail [점수 미달]");

		}
		if (attendanceRate < 30) {
			System.out.println("Fail [출석회수 부족] " + "(" + attendanceCount + "/20");
		}
	}
}
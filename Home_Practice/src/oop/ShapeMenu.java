package oop;

import java.util.Scanner;

public class ShapeMenu {
	private Scanner sc = new Scanner(System.in);
	private Squarecontroller scr = new Squarecontroller();
//	public Squarecontroller();
	private TriangleController tc = new TriangleController();
//	public TriangleController();

	public void inputMenu() {
		int cnt = 0;
		boolean exit = false;
		while (true) { // break 필수
			System.out.println("====도형 프로그램====");
			System.out.println("1. 삼각형");
			System.out.println("2. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호 입력 : ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				cnt = 0;
				triangleMenu();
				break;
			case 2:
				cnt = 0;
				squareMenu();
				break;
			case 9:
				cnt = 0;
				exit = true;
				System.out.println("프로그램 종료");
				break;
			default:
				cnt++;
				System.out.println("잘못된 번호입력");
				if (cnt > 5) {
					System.out.println("다시 실행해 주세요");
					exit = true;
				}
				// 3,4,5,6 ....
			}
			if (exit) { // 반복문 while 끝냄
				break;
			}
		}
	}

	public void triangleMenu() {
		boolean exit = false;
		System.out.println("====삼각형====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		int menuNum = sc.nextInt();
		switch (menuNum) {
		case 1:
			inputSize(3, menuNum);
			break;
		case 2:
			tc.paintColor(null);
			break;
		case 3:
			printlnformation(3);
			break;
		case 9:
//			exit = false;
			System.out.println("프로그램 종료");
			return;

		default:
			break;
		}

	}

	public void squareMenu() {
		System.out.println("====사각형====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		int menuNum = sc.nextInt();
		switch (menuNum) {
		case 1:
			inputSize(4, menuNum);
			break;
		case 2:
			inputSize(4, menuNum);
			break;
		case 3:
			inputSize(4, menuNum);
			break;
		case 4:
			printlnformation(4);
			break;
		case 9:
			System.out.println("프로그램 종료");
			break;

		default:
			break;
		}

	}

	public void inputSize(int type, int menuNum) {
//		System.out.println("높이 : ");
//		double heightInt = sc.nextDouble();
//		System.out.println("너비 :");
//		double widthInt = sc.nextDouble();

		if ((type == 3 && menuNum == 2) || (type == 3 && menuNum == 2)) {
			System.out.println("색을 입력하세요 : ");
		} else {
			System.out.println("높이 : ");
			double heightInt = sc.nextDouble();
			System.out.println("너비 :");
			double widthInt = sc.nextDouble();
			if (type == 4 && type == 1) {
				System.out.println(type + "둘레 : " + scr.calcPerimeter(heightInt, widthInt));
			} else if (type == 4 && type == 2) {
				System.out.println(type + "면적 :" + scr.calcArea(heightInt, widthInt));
			} else if (type == 3 && type == 1) {
				System.out.println(type + "면적 :" + tc.calcArea(heightInt, widthInt));
			}

		}

//		if (type == 3) {
//			if (menuNum == 1) {
//				System.out.println(type + "면적 :" + tc.calcArea(heightInt, widthInt));
//			} else if (menuNum == 2) {
//				System.out.println("색을 입력하세요 : ");
//			}
//		} else if (type == 4) {
//			if (menuNum == 1) {
//				System.out.println(type + "둘레 : " + scr.calcPerimeter(heightInt, widthInt));
//			} else if (menuNum == 2)
//				System.out.println(type + "면적 :" + scr.calcArea(heightInt, widthInt));
//		} else if (menuNum == 3) {
//			System.out.println("색을 입력하세요 : ");
//		}

	}

	public void printlnformation(int type) {
		if (type == 3) {
			System.out.println(tc.print());
		} else if (type == 4) {
			System.out.println(scr.print());
		}

	}

}

package oop;

public class Squarecontroller {
	private Shape s = new Shape(); // 명시적 초기화
//	private double height;
//	private double width;
	
	public double calcPerimeter(double height, double width) {
		// 둘레 : 너비*2 + 높이*2
		return height*2 + width*2;
		
	}
	public double calcArea(double height, double width) {
		// 넓이 : 너비 * 높이
		return width * height;
		
	}
	public void paintColor(String color) {
		s.setColor(color);
		
	}
	public String print() {
		String result = "";
		result = "사각형 : " + s.information();
		return result;
	}
	
}

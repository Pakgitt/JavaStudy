package oop;

public class TriangleController {
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
	// 넓이 : 너비 * 높이 / 2	
		return width * height / 2;
		
	}
	public void paintColor(String color) {
		s.setColor(color);
		
	}
	public String print() {
		return "삼각형 : " + s.information();
	}
	
}

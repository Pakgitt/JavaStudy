package arrayExam;

public class ArrayP1 {
	public static void main(String[] args) {
		// 길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여
		// 순서대로 배열 인덱스에 넣은 후 그 값을 출력하세요
		
		int[] num = new int[10];
		
		for(int  i = 1; i <= num.length; i++) {
			System.out.print(i + "\t");
		}
	}
}

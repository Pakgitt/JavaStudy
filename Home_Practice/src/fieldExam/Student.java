package fieldExam;

public class Student {
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {
		grade = 10;	
		classroom = 3;
		name = "박세혁";
		height = 175.8;
		gender = 'M';
	}

	public void information() {
		System.out.println(grade + classroom + name + height + gender);
	}
}

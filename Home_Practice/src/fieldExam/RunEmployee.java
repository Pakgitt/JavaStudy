package fieldExam;

public class RunEmployee {
	public static void main(String[] args) {
		
		Employee e = new Employee(100,"홍길동","영업부","과장",25,'남',2500000,0.05,"010-1234-5678","서울시 강남구");
		System.out.println(e.toString());
		
//		e.setEmpNo(100);
//		e.setEmpName("홍길동");
//		e.setDept("영업부");
//		e.setJob("과장");
//		e.setAge(25);
//		e.setGender('남');
//		e.setSalary(2500000);
//		e.setBonusPoint(0.05);
//		e.setPhone("010-1234-5678");
//		e.setAddress("서울시 강남구");
	}
}

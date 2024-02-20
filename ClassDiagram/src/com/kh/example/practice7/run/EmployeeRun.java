package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class EmployeeRun {
	public static void main(String[] args) {

		Employee ep = new Employee(100, "박세혁", "영업부", "과장", 25, 
				'남', 600000, 0.09, "010-7979-7979", "로스엔젤레스");
		
		ep.printEmployee();

	}
}

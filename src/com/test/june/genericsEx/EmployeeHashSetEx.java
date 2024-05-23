package com.test.june.genericsEx;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSetEx {

		public static void main(String[] args) {
			Employee e1 = new Employee("Abc", 2.0, 1);
			Employee e2 = new Employee("abc", 3.0, 4);
			Employee e3 = new Employee("XYZ", 4.0, 3);
			Employee e4 = new Employee("Mno", 5.0, 2);
			Employee e5 = new Employee("Abc", 77.0, 1);

			Set<Employee> employeeSet = new HashSet<>();
			employeeSet.add(e1);
			employeeSet.add(e2);
			employeeSet.add(e3);
			employeeSet.add(e4);
			employeeSet.add(e5);	
			
			for (Employee e : employeeSet) {
			    System.out.println(e);
			}

	}

}

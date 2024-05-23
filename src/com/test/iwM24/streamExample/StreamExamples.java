package com.test.iwM24.streamExample;

import java.util.Arrays;
import java.util.List;

public class StreamExamples {

	public static void main(String[] args) {
		List<Employee>employees = Arrays.asList(
				new Employee(101, "Alice", 60000),
                new Employee(102, "Bob", 55000),
                new Employee(103, "Charlie", 70000)
				);
		//Sort employee based on their salaries in desc order?
//		employees.stream().sorted(o1,o2)->(Long)(o2.ge)
		
		
		//Fetch top 3 salaried employees details
		
		
		 // Filter employees with salary > 50000
		employees.stream().filter(emp->emp.getEmpSalary()>5000)
		.forEach(System.out::println);
		
		// Calculate total salary
		long empSal = employees.stream()
						.mapToLong(Employee::getEmpSalary)
						.sum();
		System.out.println("Total sal :"+ empSal);
		
		 // Sort employees by salary (ascending)
		employees.stream()
			.sorted((e1,e2)->Long.compare(e1.getEmpSalary(), e2.getEmpSalary()))
			.forEach(emp->System.out.println(emp.getEmpName()+":"+emp.getEmpSalary()));
		
		//Print employee names
		employees.stream().map(Employee::getEmpName).forEach(System.out::println);
	}

}

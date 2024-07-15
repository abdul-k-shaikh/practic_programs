package com.test.iwM24.streamExample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamExamples {

	public static void main(String[] args) {
		List<Employee>employees = Arrays.asList(
				new Employee(101, "Alice", 60000, "CSE"),
                new Employee(102, "Bob", 55000, "IT"),
                new Employee(103, "Charlie", 70000, "HR")
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
		
		//Find 3rd highest salary
		Optional<Long> nthSalary = employees.stream().map(e->e.getEmpSalary())
		.sorted(Comparator.reverseOrder()).skip(2).findFirst();
		System.out.println("nthSalary :"+ nthSalary.get());
		
		//Find all employess details who belongs to IT
		System.out.println("Find all employess details who belongs to IT");
		employees.stream().filter(emp->"IT".equals(emp.getDeptId())).forEach(System.out::println);
	}

}

package com.test.functionFI;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {
	String name;
	double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class Test3 {

	public static void main(String[] args) {
		ArrayList<Employee> l = new ArrayList<Employee>();
		populate(l);
		System.out.println(l);
		Function<ArrayList<Employee>, Double>f = l1->{
			double total=0;
			for(Employee e: l1) {
				total=total+e.salary;
			}
			return total;
		};
		System.out.println("The total salary of this month "+ f.apply(l));
		
	}

	private static void populate(ArrayList<Employee> l) {
		l.add(new Employee("abd", 1000));
		l.add(new Employee("cdz", 2000));
		l.add(new Employee("xyz", 3000));
		l.add(new Employee("pinn", 4000));
		l.add(new Employee("tin", 5000));	
	}
}

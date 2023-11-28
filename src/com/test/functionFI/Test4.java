package com.test.functionFI;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<Employee>l = new ArrayList<>();
		populate(l);
		System.out.println("B4 increment: "+ l);
		
		//Predicate to test salary is less then 35000
		Predicate<Employee>p = e->e.salary<35000;
		
		//Function FL for increasing sal
		Function<Employee, Employee>f = e->{
				e.salary= e.salary+477;
				return e;
		};
		
		System.out.println("After increment:");
		ArrayList<Employee>l2 = new ArrayList<>();
		for(Employee e: l) {
			if(p.test(e)) {
				l2.add(f.apply(e));
			}
		}
		System.out.println(l);
		System.out.println("Emp with incrmented salary:"+ l2);
		
		
		

	}

	private static void populate(ArrayList<Employee> l) {
		l.add(new Employee("abd", 1000));
		l.add(new Employee("cdz", 420000));
		l.add(new Employee("xyz", 63000));
		l.add(new Employee("pinn", 140000));
		l.add(new Employee("tin", 150000));	
		
	}

}

class Emp {
	String name;
	Double Salary;
	public Emp(String name, Double salary) {
		super();
		this.name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", Salary=" + Salary + "]";
	}
	
}

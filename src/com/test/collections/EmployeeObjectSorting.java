package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeObjectSorting {
	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		//arraylist maintains insertion order
		al.add(new Employee(200, "Deepika"));
		al.add(new Employee(400, "sun"));
		al.add(new Employee(300, "mon"));
		al.add(new Employee(100, "mana"));
		System.out.println("Befor sorting:"+ al);
		Collections.sort(al,(e1,e2)->(e1.eno>e2.eno)?-1:(e1.eno<e2.eno)?1:0);
		System.out.println("After sorting "+ al);
	}

}

class Employee {
	int eno;
	String ename;

	Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}
	public String toString() {
		return eno+" "+ename;
		
	}
}

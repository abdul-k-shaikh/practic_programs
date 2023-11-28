package com.test.string;

import java.util.Scanner;

public class Strmtd {

	public static void main(String[] args) {
		//String str ="java is an object-oriented language";
		//Scanner sc = new Scanner(str);
		//String str1=sc.next();
		//System.out.println("use of next() "+sc.next());
		class Test{
			private int id;
			private String name;
			private double ssn;
			
			
			public Test(int id, String name, double ssn) {
				super();
				this.id = id;
				this.name = name;
				this.ssn = ssn;
			}
			public Test() {
				// TODO Auto-generated constructor stub
			}
			public int getId() {
				return id;
			}
			public void setId(int id) {
				this.id = id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public double getSsn() {
				return ssn;
			}
			public void setSsn(double ssn) {
				this.ssn = ssn;
			}
			@Override
			public String toString() {
				return "Test [id=" + id + ", name=" + name + ", ssn=" + ssn + "]";
			}
			
		}

		System.out.println("use of next() "+sc.nextLine());
		Strmtd t = new Strmtd();
//		t.setId(12);
//		t.setName("Alala");
//		t.setSsn(12344);
	} 
	
	
}

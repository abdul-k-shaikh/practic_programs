package com.test.predicate;

import java.util.function.Predicate;

class Testo {
	String name;
	int age;
	boolean isHavingGF;
	public Testo(String name, int age, boolean isHavingGf) 
	{
		this.name=name;
		this.age=age;
		this.isHavingGF=isHavingGf;
		
	}
	public String toString() {
		return name;
		
	}

}
class Tes{
	
public static void main(String[] args) 
{
		//edicate<Testo>
		Testo[] list= {
				new Testo("Durga", 60, false),
				new Testo("Sunil", 32, false),
				new Testo("shayan", 28, true),
				new Testo("Subbu", 21, true),
				new Testo("Durga", 60, false)	
		};
		
		Predicate<Testo>allowed = se->se.age>18 && se.isHavingGF;
		System.out.println("The allowed members into pub are");
		for(Testo se :list) {
			if(allowed.test(se)) {
				System.out.println(se);
			}
		}
	
	}
}

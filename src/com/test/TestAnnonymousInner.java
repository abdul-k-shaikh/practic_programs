package com.test;
class A{
	void m1(B ob) {
		System.out.println("From M1 short ");
	}
}
interface B {
	void m2();
}

class Bimpl implements B{
	public void m2() {
		System.out.println("From M2");
	}
}
public class TestAnnonymousInner {

	public static void main(String[] args) {
//		A oa = new A();
//		B ob = new Bimpl();
//		oa.m1(ob);
//		ob.m2();
		/*Same above code can be written as below 
		 * 
		 */
		new A() { //anonymous
			{ //instance block
				m1(new Bimpl() { //anonymous
					{//instance block
						m2();
					}
				});
			}
		};

	}

}

 

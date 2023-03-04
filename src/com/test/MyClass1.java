package com.test;

final class MyClass1 {

//1. producer (add) add element if the queue is not full
//2. consumer (get) get element if the queue is not empty
//3. producer start adding elements if there is a space available. 
//4. consumer can start consuming elements if
//	there are elements available to consume	
	static int MAX_SIZE = 10;
	static int[] A = new int[MAX_SIZE];
	public static void main(String[] args) {
		MyClass1 obj = new MyClass1();
		obj.producer();
		obj.consumer(0);
		
	}
	
	public void producer() {
		while(true) {
			if(A.length < MAX_SIZE) {
				A[A.length] = 123;
			}
		}
	}
	
	public int consumer(int index) {
		while(true) {
			if(A.length > 0) {
				int i = index%MAX_SIZE;
//				A[i] = 0;
				return A[i];
			}else
				return 0;
	}
	}
	

}

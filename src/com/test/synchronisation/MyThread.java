package com.test.synchronisation;

public class MyThread extends Thread{
	DisplayMessage dm;
	String name;
	
	public MyThread(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}
	
	public void run(String name) {
		dm.sayHello(name);
	}
}

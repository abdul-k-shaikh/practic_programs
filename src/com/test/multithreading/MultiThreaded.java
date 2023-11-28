package com.test.multithreading;

public class MultiThreaded extends Thread {
    // Excution switches between threads 
	public static void main(String[] args) throws InterruptedException {
		MultiThreaded mt = new MultiThreaded();
		mt.start();
		
		for(int j=1; j<=20; j++) {
			System.out.println("j: "+ j + "\t");
			Thread.sleep(1000);
		}
	}
	public void run() {
		for(int i=1; i<=20; i++) {
			System.out.println("i: "+i+ "\t");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

package com.test.p2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n = 371;
		int temp = n;
		int sum = 0;
		while(n!=0) {
			 n=n%10;
			 sum = sum+n*n*n;
			 n = n/10;	
		}
		if(sum==n) {
			System.out.println(temp + " Arm");
		}
		else {
			System.out.println( temp+" is not an Armstrong number");
		}

	}

}

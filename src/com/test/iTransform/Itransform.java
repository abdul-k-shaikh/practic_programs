package com.test.iTransform;

public class Itransform {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		
		System.out.println(isArm(n));
	}

	private static Boolean isArm(int n) {
		int temp=n;
		int sum=0;
		while(n>0) {
			int n1 = n%10;
			sum=sum+n1*n1*n1;
				n= n/10;
				
		}
		if(sum!=temp) {
			return false;
		}
		
		return true;
	}

}

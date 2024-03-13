package com.test.iTransform;

public class ArmstrongBtRange {

	public static void main(String[] args) {
		int n1=100, n2=999;
		for (n1 = 100; n1 <= 1000; n1++) {
			int temp=n1;
			int sum=0;
			int n3=0;
			while(temp>0) {
				    n3 = temp%10;
					sum=sum+(n1*n1*n1);
					temp= temp/10;
			}
			if(n1==sum) {
				System.out.println("arm is n1 "+ n1);
			}
		}

	}

}

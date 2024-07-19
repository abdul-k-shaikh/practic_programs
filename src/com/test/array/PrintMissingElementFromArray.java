package com.test.array;

public class PrintMissingElementFromArray {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no of elements");
//		int n = sc.nextInt();
//		int a[] = new int[n];
		int a[] = {1,2,3,5};
		int sum=0;
		int n = a.length;
		sum = (n+1)*(n+2)/2;

		System.out.println("sum is "+sum);
		
		for(int i=0; i<a.length; i++) {
			sum=sum-a[i];
		}
		System.out.println("Missing element is "+ sum);
	}
	
	
	

}

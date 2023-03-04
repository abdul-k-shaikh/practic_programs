package com.test.array;

public class EquilibriumPointTest {

	public static void main(String[] args) {
		int a[]= {3,1,6,-5,4,3,2};
		int n=a.length;
		System.out.println(equiPointTest(a,n));
	}

	private static int equiPointTest(int[] a, int n) {
		int ls=0, rs=0, sum=0;
		for(int i=0; i<n; i++) {
			sum+=a[i];
		}
		rs=sum;
		for(int i=0; i<n; i++) {
			rs=rs-a[i];
			if(rs==ls) {
				//System.out.println(i);
				return i;
			}
			ls=ls+a[i];
		}

		return -1;
	}

}

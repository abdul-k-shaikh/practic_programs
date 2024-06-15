package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DistinctAndMissing {
  //Deloitte i/q
	public static void main(String[] args) {
		
		int a[] = {1,2,3,5,7,4,9,10,1,8};
//		ArrayList<Integer>al = 
//		List<int[]> list = Arrays.asList(a);
//		ArrayList<Integer>al = Arrays.asList()
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(2);
		al.add(3);
		
		 List<Integer> collect = al.stream().distinct().collect(Collectors.toList());
		 System.out.println("Distinct element is "+ collect );
		int n = a.length;
		System.out.println("len:"+n);
		Set<Integer>set = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			if(set.add(a[i])!=false) {
				System.out.println(a[i]);
			}
		}
//		   sum=n(n+1)/2;
//		int sum=0;
//		
//		for(int i=0; i<n; i++) {
			
//			sum = sum+a[i];
//			sum = n*(n+1)/2;
		}
//		System.out.println("Sum is:"+sum);

	}


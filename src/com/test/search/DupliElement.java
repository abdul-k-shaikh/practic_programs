package com.test.search;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DupliElement {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[] = new int[n];
	  for(int i=0; i<n; i++) {
		  a[i]=sc.nextInt();
	  }
	  findDuplicate(a, n);
	  //System.out.println(res);

	}

	private static void findDuplicate(int[] a, int n) {
		
		//HashMap<Integer, Integer> hm = new LinkedHashMap<>();
		Set<Integer> unique = new HashSet<>();
		for(Integer ele :a) {
			if(unique.add(ele)==false) {
				System.out.println("Dupli "+ ele);
			}
		}
		//return ;
		
		
		
		//return ele;
		
		
	}

}

package com.test.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		List<Integer> integerList = new ArrayList<>();
		for(int i=0; i<n; i++) {
			integerList.add(sc.nextInt());
		}
        //System.out.println(integerList);
		
		int q = sc.nextInt();
		for(int i=0; i<q; i++) {
			String command = sc.next();
			if(command.equals("Insert")) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				
				integerList.add(x, y);
			}
			if(command.equals("Delete")) {
				int x = sc.nextInt();
				integerList.remove(x);
			}
		}
		//print list
		for(int res : integerList) {
			System.out.print(integerList);
		}
	}

}

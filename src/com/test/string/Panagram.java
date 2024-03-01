package com.test.string;

public class Panagram {

	public static void main(String[] args) {
		String s = "THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
		//String s="he is abdyul";
		s=s.replace(" ", "");
		char y[] = s.toCharArray();
		int len = y.length;
		int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i=0; i<len; i++) {
			int index = y[i]-65;
			a[index]=1;
			
		}
		for(int i=0; i<26; i++) {
			if(a[i]==1) {
				//i++;
				continue;
			}
			else {
				System.out.println("Non-panagram");
				System.exit(0);
			}
		}
		System.out.println("Panagram");
	}
}

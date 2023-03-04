package com.test.fileOperation;

import java.util.Scanner;

public class File_Path {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, name="", extn="", path="";
		int a=0, b=0;
		System.out.println("Enter String");
		str=sc.nextLine();  // c:\pic\wall\car.png
		int test=str.f
		a=str.lastIndexOf('\\');
		b=str.lastIndexOf('.');
		System.out.println("a index"+ a);
		System.out.println("b" +b);
		path=str.substring(0,a+1);
		name=str.substring(a,b+1);
		extn=str.substring(b+1);
		System.out.println("path: "+path);
		System.out.println("File name: "+name);
		System.out.println("File extension"+extn);
		
	}

}

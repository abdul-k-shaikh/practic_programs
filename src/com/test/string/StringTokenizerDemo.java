package com.test.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
      String s = "you are the creator of your destiny";
      
      StringTokenizer st  = new StringTokenizer(s);
      
      while(st.hasMoreTokens()) {
    	  System.out.println(st.nextToken());
      }
      
	}

}

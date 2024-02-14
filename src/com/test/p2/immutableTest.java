package com.test.p2;

public class immutableTest {

	public static void main(String[] args) {
		String s1 = "Java"; //"Java" String created in pool and reference assigned to s1
		String s2 = s1; //s2 also has the same reference to "Java" in the pool
		System.out.println("s1==s2 :"+ s1==s2);

		s1 = "Python"; //s1 value got changed above, so how String is immutable?
		System.out.println(s1);
		System.out.println(s2);
		
		
		System.out.println(s1 == s2); 
		// prints "Java" supporting the fact that original String value is unchanged, hence String is immutable
//https://www.digitalocean.com/community/tutorials/java-programming-interview-questions#25-how-do-you-remove-all-occurrences-of-a-given-character-from-an-input-string-in-java
	}

}

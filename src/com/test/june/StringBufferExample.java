package com.test.june;

public class StringBufferExample {

	public static void main(String[] args) {
		String originalString = "This method returns the reversed object on which it was called";
        StringBuffer buffer = new StringBuffer(originalString);
        
        //reverse the character
//       StringBuffer reversedWords = buffer.reverse();
        
//        System.out.println(reversedWords);
        buffer.reverse();
        String revWords = buffer.toString();
        System.out.println(revWords);
        
        

	}

}

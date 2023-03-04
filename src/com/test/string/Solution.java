package com.test.string;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        char[] ar=A.toCharArray();
        String temp = A;
        int len = ar.length;
        //System.out.print("len is "+len);
        String rev="";
        for(int i=len-1; i>=0; i--){
             //rev=rev+A.charAt(len);
             System.out.print(ar[i]);
        }
        //System.out.print(rev);
        /* Enter your code here. Print output to STDOUT. */
        
        
    }
}




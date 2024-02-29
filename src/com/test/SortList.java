package com.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

    public static void main(String[] args) {

        // create list
        List <String> list = new ArrayList <String>();
        list.add("Mumbai");
        list.add("Pune");
        list.add("Gujarat");
        list.add("Haryana");
        list.add("Jammu");

//        Collections.sort(list); // ascending order 
        System.out.println("sorted in ascending order"+list);

        Collections.reverse(list); // descending order 
        System.out.println("sorted in descending order"+list);
    }
}
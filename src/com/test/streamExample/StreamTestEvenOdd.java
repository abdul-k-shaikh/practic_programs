package com.test.streamExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTestEvenOdd {

	public static void main(String[] args) {
		//1 way 
		Stream<Integer>s = Stream.of(1,2,3,4,5,6,7,78);
		s.filter(p->p%2==0)
		.collect(Collectors.toList())
		.forEach(e->System.out.println(e+" "));
		
		//2nd way
		
		List<Integer>result = s.filter(p->p%2==0)
				.collect(Collectors.toList());
		System.out.println("result :"+result);

	}

}

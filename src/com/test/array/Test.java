package com.test.array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		//approach 1
		//input
		int nums[]= {2,2,1,3,3,5,7};
		int res = 0;
		//output : 1
//		for(int i=0; i<nums.length; i++) {
//			for(int j=1; j<=nums.length-1; j++) {
//				if(nums[i]!=nums[j]) {
//					res=nums[j];
//				}
//				
//			}
//			
//		}
//		System.out.println(res);
		
		Map<Integer, Integer>mp = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(mp.containsKey(nums[i])==false){
				mp.put(nums[i],1);
			}
			else {
				int oldVal=mp.get(nums[i]);
				int newVal = oldVal+1;
				mp.put(nums[i], newVal);
			}
		}
		Set<Map.Entry<Integer, Integer>>m1 = mp.entrySet();
		for(Map.Entry<Integer,Integer>ele:m1) {
			if(ele.getValue()==1) {
				System.out.println(ele.getKey());
			}
		}
	}
}

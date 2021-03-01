package pers.you.learning.leetcode.eighteen;


import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FindMajorityElementLCCI {

	@Test
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(Integer i:nums){
        	if(map.containsKey(i)){
        		map.put(i, map.get(i)+1);
        	}else{
        		map.put(i, 1);
        	}
        }
        for(Integer k:map.keySet()){
        	if(map.get(k)>nums.length/2){
        		return k;
        	}
        }
		
		
		return -1;
		
    }
	
}

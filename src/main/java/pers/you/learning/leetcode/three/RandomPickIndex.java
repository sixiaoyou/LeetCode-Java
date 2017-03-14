/*
LeetCode 398:Random Pick Index
Given an array of integers with possible duplicates, randomly output the index of a given target number. You can assume that the given target number must exist in the array.

Note:
The array size can be very large. Solution that uses too much extra space will not pass the judge.

Example:

int[] nums = new int[] {1,2,3,3,3};
Solution solution = new Solution(nums);

// pick(3) should return either index 2, 3, or 4 randomly. Each index should have equal probability of returning.
solution.pick(3);

// pick(1) should return 0. Since in the array only nums[0] is equal to 1.
solution.pick(1);
 */



package pers.you.learning.leetcode.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomPickIndex {
	int[] nums;
    public RandomPickIndex(int[] nums) {
        this.nums=nums;
        
    }
    
    public int pick1(int target) {
        List<Integer> list = new ArrayList<Integer>();
    	for(int i=0;i<nums.length;i++ ){
    		if(nums[i]==target){
    			list.add(i);
    		}
    	}
    	Collections.shuffle(list);
    	return list.get(0);
        
    }
    public int pick2(int target) {
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i=0;i<nums.length;i++ ){
    		if(nums[i]==target){
    			list.add(i);
    		}
    	}
    	Random r = new Random();
    	return(list.get(r.nextInt(list.size()))); 	
    }
}

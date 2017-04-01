/*
 
LeetCode 260:Single Number III
Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

For example:

Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].

Note:

1.The order of the result is not important. So in the above example, [5, 3] is also correct.
2.Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?

'''
 */



package pers.you.learning.leetcode.seventeentwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumberIII {

	public int[] singleNumberV1(int[] nums) {
		// TODO Auto-generated method stub
		int[] returnNums={0,0};
		int xor=nums[0];
		for(int i=1;i<nums.length;i++){
			xor^=nums[i];
		}
		int lowBit=xor & -xor;
		for(int j=0;j<nums.length;j++){
			if((nums[j] &lowBit)==0){
				returnNums[0]^=nums[j];
			}
			else{
				returnNums[1]^=nums[j];
			}
		}
		return returnNums;
	}
	
	public int[] singleNumberV2(){
		int[] nums={1, 2, 1, 3, 2, 5};
		int[] returnNums={0,0};
		List<Integer> list = new ArrayList<Integer>();
		Map<Integer, Integer> map =new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++){
			if(map.get(nums[i])==null){
				list.add(nums[i]);
				map.put(nums[i], nums[i]);
			}
			else{
				for(int k=0;k<list.size();k++){
					if(list.get(k)==nums[i]){
						list.remove(k);
					}
				}
			}
		}
		returnNums[0]=list.get(0);
		returnNums[1]=list.get(1);
		return returnNums;
	}

}

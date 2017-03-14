/*
LeetCode 137:Single Number II
Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */



package pers.you.learning.leetcode.three;

import java.util.Arrays;

public class SingleNumberII {
	  public int singleNumber(int[] nums) {
	        int returnNum=0;
	        Arrays.sort(nums);
	        if(nums.length==1){
	            return nums[0];
	        }
	        else{
	            for(int i=0;i<nums.length;i++){
	                if(i==0 && nums[0]!=nums[1]){
	                    returnNum=nums[0];
	                }else if(i==nums.length-1 && nums[i]!=nums[i-1]){
	                    returnNum=nums[nums.length-1];
	                }else if(i>0&&i<nums.length-1){
	                    if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
	                        returnNum=nums[i];
	                    }
	                }
	            }
	        }
	        return returnNum;
	    }
}

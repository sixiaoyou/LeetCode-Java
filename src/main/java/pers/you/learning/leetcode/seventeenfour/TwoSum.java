package pers.you.learning.leetcode.seventeenfour;

import java.awt.Label;

import org.junit.Test;

/*
LeetCode 1Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */



public class TwoSum {
    public int[] twoSumV1(int[] nums, int target) {
        int[] returnArray = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    returnArray[0]=i;
                    returnArray[1]=j;
                    return returnArray;
                }
            }
        }
        return returnArray;
    }  
}

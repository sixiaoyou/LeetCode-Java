/*
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */



package pers.you.learning.leetcode.three;

import java.util.Arrays;

public class MaximumSubarray {
	public int maxSubArrayV1(int[] nums) {
        int[] sortNums=nums.clone();
		    Arrays.sort(sortNums);
		    int maxNum=sortNums[sortNums.length-1];
		    int thisNum=0;
		    for(int i=0;i<nums.length;i++){
		    	thisNum+=nums[i];
		    	if(thisNum>maxNum){
		    		maxNum=thisNum;
		    	}
		    	else if(thisNum<0){
		    		thisNum = 0;
		    	}
		    }
		   return maxNum;	
		   }
	
	
	//网友实现:http://www.cnblogs.com/boring09/p/4252780.html
	public int maxSubArrayV2(int[] nums) {
        int sum=nums[nums.length-1];
        int maxNum = sum;
        for(int i=nums.length-2;i>=0;i--){
            sum=Math.max(nums[i],nums[i]+sum);
            maxNum=Math.max(sum,maxNum);
        }
        return maxNum;
   }
}

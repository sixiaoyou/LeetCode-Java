/*
 '''
LeetCode 238. Product of Array Except Self
Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Solve it without division and in O(n).

For example, given [1,2,3,4], return [24,12,8,6].

Follow up:
Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
'''
 */

package pers.you.learning.leetcode.seventeentwo;

import java.util.List;

public class ProductOfArrayExceptSelf {
	
	public class Solution {
	    public int[] productExceptSelf(int[] nums) {
			int[] nums2=new int[nums.length];
			int total1=1;
			int total2=1;
			int count=0;
			for(int i=0;i<nums.length;i++){
				if(nums[i]==0){
					count+=1;
					continue;
				}
				else{
				total1*=nums[i];
				total2*=nums[i];
			}
		}

			for(int j=0;j<nums.length;j++){
				if(count==1){
					if(nums[j]==0){
						nums2[j]=total2;
					}
				}
				else if (count==0){
					nums2[j]=total1/nums[j];
					}
				}
			    return nums2;
			}
	}
}

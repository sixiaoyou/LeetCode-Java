/*
'''
网友实现：http://bookshadow.com/weblog/2015/09/28/leetcode-find-duplicate-number/
LeetCode 287:Find the Duplicate Number
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
'''
 */



package pers.you.learning.leetcode.three;

public class FindTheDuplicateNumber {

	 public int findDuplicate(int[] nums) {
			int low=0;
			int high=nums.length-1;
			int cnt=0;
			int mid=0;
			while(low<=high){
				mid=(low+high)>>1;
				for(int j=0;j<nums.length;j++){
					if(nums[j]<=mid){
					    cnt+=1;
					}
				}
				if(cnt>mid){
					high=mid-1;
				}
				else{
					low=mid+1;
				}
				cnt=0;
			}
			return low;
		}
}

/*
网友实现:http://www.cnblogs.com/ccsccs/articles/4215628.html
 LeetCode 35:Search Insert Position
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
 */


package pers.you.learning.leetcode.seventeenthree;

public class SearchInsertPosition {
	   public int searchInsert(int[] nums, int target) {
	        	int l=0;
	        	int r=nums.length-1;
	        	while(l<=r){
	        		int mid = (l+r)/2;
	        		if(nums[mid]==target){
	        				return mid;
	        		}
	        		else if(nums[mid]<target){
	        			l+=1;
	        		}
	        		else{
	        			r-=1;
	        		}
	        	}
	        	return l;
	    }
}

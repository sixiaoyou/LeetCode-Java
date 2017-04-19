package pers.you.learning.leetcode.seventeenfour;



/*
LeetCode 303:Range Sum Query - Immutable
Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

Example:
Given nums = [-2, 0, 3, -5, 2, -1]

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
Note:
You may assume that the array does not change.
There are many calls to sumRange function.
 */

public class RangeSumQueryImmutable {
    int[] sums;
    public RangeSumQueryImmutable(int[] nums) {
        int size=nums.length;
        sums=new int[size+1];
        for(int i=0;i<size;i++){
            sums[i+1]+=sums[i]+nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        return sums[j+1]-sums[i];
    }
}

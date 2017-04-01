/*
 LeetCode 448:Find All Numbers Disappeared in an Array
 Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]
 */
package pers.you.learning.leetcode.seventeentwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> finalNums = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++){
			nums[Math.abs(nums[i])-1]=-Math.abs(nums[Math.abs(nums[i])-1]);
		}
		for(int j=0;j<nums.length;j++){
			if(nums[j]>0){
				finalNums.add(j+1);
			}
		}
	    return finalNums;
	}
}

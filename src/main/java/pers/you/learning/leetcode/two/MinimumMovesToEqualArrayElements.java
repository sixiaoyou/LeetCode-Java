/*
 LeetCode 453:Minimum Moves to Equal Array Elements
Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal, where a move is incrementing n - 1 elements by 1.

Example:

Input:
[1,2,3]

Output:
3

Explanation:
Only three moves are needed (remember each move increments two elements):

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
package pers.you.learning.leetcode.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumMovesToEqualArrayElements {
    public int minMoves(int[] nums) {
		int count=0;
		Arrays.sort(nums);
		for(int j=0;j<nums.length-1;j++){
			count+=nums[j+1]-nums[0];
		}
	    return count;	
	    }
    }


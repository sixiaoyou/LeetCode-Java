package pers.you.learning.leetcode.seventeenseven;

/*
'''
LeetCode581. Shortest Unsorted Continuous Subarray
Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
Note:
Then length of the input array is in range [1, 10,000].
The input array may contain duplicates, so ascending order here means <=.

'''
 */



import java.util.Arrays;

import org.junit.Test;

public class ShortestUnsortedContinuousSubarray {
    
    public int findUnsortedSubarray(int[] nums) {
        int[] copyNums = nums.clone();
        Arrays.sort(copyNums);
        int start = -1;
        int end = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=copyNums[i]){
                if(start==-1){
                    start = i;    
                }
                end = i;
                
            }
        }
        return (end==start)?0:end-start+1;
    }
}

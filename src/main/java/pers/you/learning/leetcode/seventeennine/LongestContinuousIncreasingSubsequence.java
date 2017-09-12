package pers.you.learning.leetcode.seventeennine;

/*
'''
LeetCode674. Longest Continuous Increasing Subsequence
Given an unsorted array of integers, find the length of longest continuous increasing subsequence.

Example 1:
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.
Example 2:
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1.
Note: Length of the array will not exceed 10,000.
'''
 */

public class LongestContinuousIncreasingSubsequence {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1, temp = 0, length = nums.length;
        if (length < 2) {
            return length;
        } else {
            for (int i = 0; i < length - 1; i++) {
                if (nums[i + 1] > nums[i]) {
                    count += 1;
                } else {
                    if (count > temp) {
                        temp = count;
                    }
                    count = 1;
                }
            }
            if (count > temp) {
                temp = count;
            }
            return temp;
        }

    }
}

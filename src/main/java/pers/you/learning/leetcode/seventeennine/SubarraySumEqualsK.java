package pers.you.learning.leetcode.seventeennine;

import java.util.HashMap;
import java.util.Map;

/*
'''
【网友实现】:http://bookshadow.com/weblog/2017/04/30/leetcode-subarray-sum-equals-k/
LeetCode560. Subarray Sum Equals K
Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.

Example 1:
Input:nums = [1,1,1], k = 2
Output: 2
Note:
The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
'''
 */

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            sum += nums[i];
            Integer temp = map.get(sum - k);
            if (temp != null) {
                count += temp;
            }

        }
        return count;
    }
}

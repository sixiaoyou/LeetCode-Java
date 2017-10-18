package pers.you.learning.leetcode.seventeenten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
'''
LeetCode697. Degree of an Array
Given a non-empty array of non-negative integers nums, the degree of this array is defined as the maximum frequency of any one of its elements.

Your task is to find the smallest possible length of a (contiguous) subarray of nums, that has the same degree as nums.

Example 1:
Input: [1, 2, 2, 3, 1]
Output: 2
Explanation:
The input array has a degree of 2 because both elements 1 and 2 appear twice.
Of the subarrays that have the same degree:
[1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
The shortest length is 2. So return 2.
Example 2:
Input: [1,2,2,3,1,4,2]
Output: 6
Note:

nums.length will be between 1 and 50,000.
nums[i] will be an integer between 0 and 49,999.
'''
 */



public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map3 = new HashMap<Integer, Integer>();
        Boolean mark = false;
        for (int i = 0; i < nums.length; i++) {
            if (map1.get(nums[i]) == null) {
                map1.put(nums[i], 1);
                map2.put(nums[i], i);
                map3.put(nums[i], i);
            } else {
                mark = true;
                map1.put(nums[i], map1.get(nums[i]) + 1);
                map2.put(nums[i], i - map3.get(nums[i]) + 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map1.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int max1 = list.get(0).getValue();
        int max2 = map2.get(list.get(0).getKey());
        for (Map.Entry<Integer, Integer> map : list) {
            if (map.getValue() == max1) {
                int temp = map2.get(map.getKey());
                if (temp < max2) {
                    max2 = temp;
                }
            } else {
                break;
            }
        }
        if (mark)
            return max2;
        else
            return max2 + 1;

    }
}

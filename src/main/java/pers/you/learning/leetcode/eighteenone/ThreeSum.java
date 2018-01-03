package pers.you.learning.leetcode.eighteenone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
LeetCode15. 3Sum
Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ret = new ArrayList();
        if (nums.length <= 2) {
            return ret;
        }
        int tar = 0;
        Arrays.sort(nums);
        int i = 0;
        while (i < nums.length - 2) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if ((nums[i] + nums[j] + nums[k]) < tar) {
                    j += 1;
                } else if ((nums[i] + nums[j] + nums[k]) > tar) {
                    k -= 1;
                } else {
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    ret.add(temp);
                    j += 1;
                    k -= 1;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j += 1;
                        while (j < k && nums[k] == nums[k + 1]) {
                            k -= 1;
                        }

                    }
                }
            }
            while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                i += 1;
            }
            i += 1;
        }
        return ret;

    }
}

package pers.you.learning.leetcode.seventeenseven;

/*
'''
LeetCode611. Valid Triangle Number
Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

Example 1:
Input: [2,2,3,4]
Output: 3
Explanation:
Valid combinations are:
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3
Note:
The length of the given array won't exceed 1000.
The integers in the given array are in the range of [0, 1000].
'''
*/

import java.util.Arrays;

public class ValidTriangleNumber {
    public int triangleNumberV1(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int ans = 0;
        for (int i = 0; i < size - 2; i++) {
            if (nums[i] == 0)
                continue;
            int k = i + 2;
            for (int j = i + 1; j < size - 1; j++) {
                while (k < size && nums[k] < nums[i] + nums[j])
                    k++;
                ans += k - j - 1;
            }
        }
        return ans;
    }

    public int binarySearch(int[] nums, int start, int target) {
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int triangleNumberV2(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int count = 0;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                int k = binarySearch(nums, j + 1, nums[i] + nums[j]);
                count += k - j - 1;
            }
        }
        return count;
    }

    public int triangleNumberV3(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int count = 0;
        for (int i = 0; i < size - 2; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (nums[i] + nums[j] > nums[k]) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }

}

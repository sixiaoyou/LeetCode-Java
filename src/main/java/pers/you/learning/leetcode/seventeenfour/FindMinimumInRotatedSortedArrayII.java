/*
'''
LeetCode154:Find Minimum in Rotated Sorted Array II
Follow up for "Find Minimum in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array may contain duplicates.
'''
 */







package pers.you.learning.leetcode.seventeenfour;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;

public class FindMinimumInRotatedSortedArrayII {
    public int findMinV1(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }

    public int findMinV2(int[] nums) {
        int min = nums[0];
        for (Integer i : nums) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    
//网友实现:http://bookshadow.com/weblog/2014/11/06/find-minimum-in-rotated-sorted-array-ii/
    public int findMinV3(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left < right) {
            mid = (left + right) / 2;
            int[] numsFront = new int[mid + 1];
            int[] numsBehind = new int[nums.length - mid - 1];
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if (i < mid + 1) {
                        numsFront[i] = nums[i];
                    } else {
                        numsBehind[i - mid - 1] = nums[i];
                    }
                }
                return Math.min(findMinV3(numsFront), findMinV3(numsBehind));
            }

        }
        return nums[left];
    }

    public void FinMinimumInRotatedSortedAIITestCase() {
        int[] nums = { 1, 1 };
        System.out.println(findMinV3(nums));
    }

    public FindMinimumInRotatedSortedArrayII() {
        FinMinimumInRotatedSortedAIITestCase();
    }

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArrayII f = new FindMinimumInRotatedSortedArrayII();
    }
}

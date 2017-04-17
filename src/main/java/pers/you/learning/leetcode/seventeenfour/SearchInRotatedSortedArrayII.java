package pers.you.learning.leetcode.seventeenfour;


/*
LeetCode81:Search in Rotated Sorted Array II
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Write a function to determine if a given target is in the array.

The array may contain duplicates.
 */


import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class SearchInRotatedSortedArrayII {
    public boolean searchV1(int[] nums, int target) {
        for (Integer i : nums) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }

    public boolean searchV2(int[] nums, int target) {
        List list = Arrays.asList(ArrayUtils.toObject(nums));
        return list.contains(target);
    }

    public boolean searchV3(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[low] < nums[mid]) {
                if (nums[low] <= target && target <= nums[high]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] <= target && target <= high) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
}

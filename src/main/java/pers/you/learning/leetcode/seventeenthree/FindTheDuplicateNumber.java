/*
'''
网友实现：http://bookshadow.com/weblog/2015/09/28/leetcode-find-duplicate-number/
LeetCode 287:Find the Duplicate Number
Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive), prove that at least one duplicate number must exist. Assume that there is only one duplicate number, find the duplicate one.

Note:
You must not modify the array (assume the array is read only).
You must use only constant, O(1) extra space.
Your runtime complexity should be less than O(n2).
There is only one duplicate number in the array, but it could be repeated more than once.
'''
 */

package pers.you.learning.leetcode.seventeenthree;

import java.util.HashSet;

public class FindTheDuplicateNumber {

    public int findDuplicateV1(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int cnt = 0;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) >> 1;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] <= mid) {
                    cnt += 1;
                }
            }
            if (cnt > mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            cnt = 0;
        }
        return low;
    }

    // 极客学院：暴力求解法
    public int findDuplicateV2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        return nums[i];
                    }
                }
            }
            return 0;
        }
    }

    // 极客学院：Hash表法
    public int hashFunctionV3(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else {
            HashSet<Integer> hashSet = new HashSet<Integer>();
            for (int i : nums) {
                if (!hashSet.contains(i)) {
                    hashSet.add(i);
                } else {
                    return i;
                }
            }
            return 0;
        }

    }

    // 极客学院：数组环法
    public int findDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else {
            int n = nums.length;
            int fast = n - 1;
            int slow = n - 1;
            while (true) {
                slow = nums[slow] - 1;
                fast = nums[fast] - 1;
                fast = nums[fast] - 1;
                if (fast == slow) {
                    break;
                }
            }
            slow = n - 1;
            while (slow != fast) {
                slow = nums[slow] - 1;
                fast = nums[fast] - 1;
            }
            return slow + 1;
        }
    }
}

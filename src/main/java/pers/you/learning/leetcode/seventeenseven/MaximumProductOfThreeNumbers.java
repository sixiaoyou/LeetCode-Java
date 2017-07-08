package pers.you.learning.leetcode.seventeenseven;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[length-1]*nums[length-2]*nums[length-3],nums[0]*nums[1]*nums[nums.length-1]);
      
    }
}


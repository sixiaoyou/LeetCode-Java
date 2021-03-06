package pers.you.learning.leetcode.seventeenten;

/*
'''
LeetCode209. Minimum Size Subarray Sum
Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.

For example, given the array [2,3,1,2,4,3] and s = 7,
the subarray [4,3] has the minimal length under the problem constraint.
'''
 */

public class MinimumSizeSubarraySum {
//    网友实现
    public int minSubArrayLenV1(int s, int[] nums) {
        int start = 0,sum = 0,length = nums.length+1;
        for(int i = 0 ;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=s){
                int size = i - start + 1;
                if(length>size){
                    length = size;
                }
                sum-=nums[start];
                start+=1;
            }
        }
        if(length == nums.length+1){
            return 0;
        }else{
            return length;
        }   
    }
    
    
    
    public int minSubArrayLenV2(int s, int[] nums) {
        int ln = nums.length;
        if (ln == 0) {
            return 0;
        }
        int start = 0, end = 0, count = 1, sum = nums[0], min = ln;
        while (start < ln) {
            if (sum < s) {
                if (end < ln - 1) {
                    end += 1;
                } else {
                    break;
                }
                sum += nums[end];
                count += 1;
            } else {
                if (count < min) {
                    min = count;
                }
                if (end == ln - 1 && sum <= s) {
                    return min;
                }
                while (sum >= s) {
                    sum -= nums[start];
                    count -= 1;
                    if (sum >= s && min > count) {
                        min = count;
                    }
                    start += 1;
                }
                // start+=1;
                if (end < ln - 1) {
                    end += 1;
                    sum += nums[end];
                    count += 1;
                }
            }

        }
        if (min < ln) {
            return min;
        } else {
            return 0;
        }
    }
}

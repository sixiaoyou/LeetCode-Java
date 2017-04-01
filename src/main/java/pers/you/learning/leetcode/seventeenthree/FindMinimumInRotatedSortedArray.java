/*
'''
LeetCode 153:Find Minimum in Rotated Sorted Array
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

You may assume no duplicate exists in the array.
'''
 */



package pers.you.learning.leetcode.seventeenthree;

import java.util.Arrays;

import org.apache.commons.lang3.*;

public class FindMinimumInRotatedSortedArray {
    public int findMinV1(int[] nums) {
        Arrays.sort(nums);
        return nums[0];

    }
    public int findMinV2(int[] nums) {
        int low = 0;int high = nums.length-1;
        while(low<high){
            int mid = (low+high)/2;
            if(nums[mid]<=nums[high]){
                high = mid;
            }
            else{
                low=mid+1;
            }
        }
        return nums[low];
    }

    public void FindMinimumInRotatedSortedArrayTestCase(){
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(findMinV1(nums));
        System.out.println(findMinV2(nums));
    }
    
    public FindMinimumInRotatedSortedArray() {
        FindMinimumInRotatedSortedArrayTestCase();
    }
    
    public static void main(String[] args){
        FindMinimumInRotatedSortedArray min = new FindMinimumInRotatedSortedArray();
    }
}

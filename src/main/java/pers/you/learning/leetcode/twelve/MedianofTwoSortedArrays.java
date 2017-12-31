package pers.you.learning.leetcode.twelve;

import java.util.Arrays;

/*
 * 
 * Leet4. Median of Two Sorted Arrays
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
 */
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length];
        for(int i = 0;i<nums1.length;i++){
            nums[i] = nums1[i];
        }    
        for(int j = 0;j<nums2.length;j++){
            nums[j+nums1.length] = nums2[j];
        }
        Arrays.sort(nums);
        if(nums.length%2==0){
            return (float)(nums[nums.length/2]+nums[nums.length/2-1])/2;
        }else{
            return nums[nums.length/2];
        }
            
    }
}

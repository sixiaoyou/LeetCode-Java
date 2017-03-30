/*
'''
LeetCode 75:Sort Colors
Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note:
You are not suppose to use the library's sort function for this problem.
'''
 */

package pers.you.learning.leetcode.three;

public class SortColors {
 public void sortColors(int[] nums) {
        int a=0;
        int b=0;
        for(Integer i:nums){
            if(i==0){
                a+=1;
            }
            else if(i==1){
                b+=1;
            }
        }
        for(int i=0;i<a;i++){
            nums[i]=0;
        }
        for(int i=a;i<a+b;i++){
            nums[i]=1;
        }
        for(int i=a+b;i<nums.length;i++){
            nums[i]=2;
        }
    }
}

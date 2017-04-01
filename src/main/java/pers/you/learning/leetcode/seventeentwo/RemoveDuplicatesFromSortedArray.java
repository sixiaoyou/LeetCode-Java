/*
'''
LeetCode 26:Remove Duplicates from Sorted Array
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.

Subscribe to see which companies asked this question
'''
 */




package pers.you.learning.leetcode.seventeentwo;

public class RemoveDuplicatesFromSortedArray {
       public int removeDuplicatesV1(int[] nums) {
           int j=0;
           for(int i=0;i<nums.length;i++){
               if(nums[i]!=nums[j]){
                   int k = nums[i];
                   nums[i]=nums[j+1];
                   nums[j+1]=k;
                   j+=1;
               }
           }
           return j+1;
    }
      
       //网友实现:http://blog.csdn.net/yyd19921214/article/details/47686983s
       public int removeDuplicatesV2(int[] nums) {
           int j=1;
           int k=1;
           while(j<nums.length){
               if(nums[j]!=nums[k-1]){
                   nums[k++]=nums[j];
               }
               j+=1;
           }
           return k;
       }

}

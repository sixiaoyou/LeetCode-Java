package pers.you.learning.leetcode.seventeenthree;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums,int size){
        if(nums.length<size+1){
            return nums.length;
        }
        int j=size,k=size;
        while(j<nums.length){
            if(nums[j]!=nums[k-size]){
                nums[k]=nums[j];
                k+=1;
            }
            j+=1;
        }
        return k;
    }
}

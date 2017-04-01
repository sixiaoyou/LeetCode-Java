package pers.you.learning.leetcode.seventeenthree;

public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3){
            return nums.length;
        }
        
        int j=2,k=2;  
        while(j<nums.length){  
            if(nums[j]!=nums[k-2])  
                nums[k++]=nums[j];  
            j++;  
        }  
        return k;
    }
}

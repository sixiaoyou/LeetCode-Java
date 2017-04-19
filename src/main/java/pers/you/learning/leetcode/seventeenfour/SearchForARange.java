package pers.you.learning.leetcode.seventeenfour;



/*
LeetCode34:Search for a Range
Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 */
import org.junit.Test;

public class SearchForARange { 
    public int[] searchRange(int[] nums, int target){
        int low=0,high=nums.length-1;
        int start=-1,end=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int flag1=mid,flag2=mid;
            if(nums[mid]==target){
                while(nums[flag1]==target){
                    start=flag1;
                    flag1-=1;
                 
                    if(flag1<0){
                        break;
                    }
                }
                
                while(nums[flag2]==target){
                    end=flag2;
                    flag2+=1;
                    if(flag2==nums.length){
                        break;
                    }
                }
                break;
                }     
            else{
                if(nums[mid]<target){
                    low+=1;
                }
                else if(nums[mid]>target){
                    high-=1;
                }
            }
        }
       int[] returnArray = {start,end};
       return returnArray;
    }
}

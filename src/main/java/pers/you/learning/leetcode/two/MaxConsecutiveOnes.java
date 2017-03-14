/*
LeetCode 485:Max Consecutive Ones
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
Subscribe to see which companies asked this question.
 */
package pers.you.learning.leetcode.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//V1
public class MaxConsecutiveOnes {
	 public int findMaxConsecutiveOnesV1(int[] nums) {
	        List<Integer> lenNums=new ArrayList<Integer>();
			List<Integer>  countNums=new ArrayList<Integer>();
			boolean zeroBoolean=false;
			boolean oneBoolean=false;
			int maxNumber=0;
			for(int i=0;i<nums.length;i++){
				lenNums.add(nums[i]);
				if(nums[i]==0){ 
				zeroBoolean=true;
			}
				else {
					oneBoolean=true;
				}
			}
			if(!zeroBoolean&&oneBoolean){
				maxNumber=lenNums.size();
			}
			else if(zeroBoolean&&!oneBoolean){
				maxNumber=0;
			}
			else{
				int previous=lenNums.indexOf(0);
			for(int j=1;j<lenNums.size();j++){
				if (lenNums.get(j-1)==0 && j-1!=previous){
					countNums.add(j-previous-2);
					previous=j-1;
				}
				else{
					continue;
					}
				}
			countNums.add(lenNums.indexOf(0)-0);
			countNums.add(lenNums.size()-previous-1);
			maxNumber=Collections.max(countNums);
			}
	        return maxNumber;
	    }

//V2
 public int findMaxConsecutiveOnesV2(int[] nums) {
	        int max=0;
	 		int count=0;
	 		for(int i=0;i<nums.length;i++){
	 			if(nums[i]==1){
	 				count+=1;
	 				max=Math.max(max, count);
	 			}
	 			else{
	 				count=0;
	 			}
	 		}
	 		return max;
	     }
	}


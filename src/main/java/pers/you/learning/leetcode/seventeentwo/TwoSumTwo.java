/*
 LeetCode 167:Two Sum II - Input array is sorted
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2

Subscribe to see which companies asked this question.
 */

package pers.you.learning.leetcode.seventeentwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumTwo {
		public int[] twoSum(int[] numbers, int target) {
		int sum=0;
		int test=0;
		int[] returnArray=new int[2];
		List<Integer> list=new ArrayList<Integer>();
		List<Integer>list1=new ArrayList<Integer>();
		
		Set set=new HashSet();
		for(int i=0;i<numbers.length;i++){
			list.add(numbers[i]);
		}
		set.addAll(list);
	    list1.addAll(set);
	    
		for(int j:list1){
			if(j==target/2&&target%2==0){
				sum+=1;
				test=j;
				returnArray[0]=list.indexOf(test)+1;
				returnArray[1]=list.indexOf(test)+2;
				break;
				}
			else if(list1.contains(target-j)){
				if(list.indexOf(j)<list.indexOf(target-j)){
				    returnArray[0]=list.indexOf(j)+1;
				    returnArray[1]=list.indexOf(target-j)+1;
					
			        break;
				}
				else{
				    returnArray[0]=list.indexOf(target-j)+1;
				    returnArray[1]=list.indexOf(j)+1;
			        break;
					}
				}
			}
		return returnArray;
		}
}


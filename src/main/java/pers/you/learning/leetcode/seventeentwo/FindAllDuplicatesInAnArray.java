/*
 LeetCode 442:Find All Duplicates in an Array 
Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
 */


package pers.you.learning.leetcode.seventeentwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesInAnArray {
	public static void main(String[] args){
		int[] test={4,3,2,7,8,2,3,1};
		Map<Integer,Integer> dict=new HashMap<Integer,Integer>();
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> returnList=new ArrayList<Integer>();
		for (int i=0;i<test.length;i++){
			list.add(test[i]);
		}
		for (int i:list){
			if(dict.get(i)==null){
				dict.put(i, i);
			}
			else{
				returnList.add(i);
			}
		}
		System.out.println(returnList);
	}
}

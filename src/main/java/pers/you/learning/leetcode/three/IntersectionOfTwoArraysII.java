/*
LeetCode 350:Intersection of Two Arrays II
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */



package pers.you.learning.leetcode.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArraysII {

		public int[] intersect(int[] nums1, int[] nums2) {
			int count=0;
			List<Integer> list = new ArrayList<Integer>();
			Map<Integer, Integer> mapNums1 = new HashMap<Integer, Integer>();
			Map<Integer, Integer> mapNums2 = new HashMap<Integer, Integer>();
			for(int i=0;i<nums1.length;i++){
				mapNums1.put(nums1[i], mapNums1.getOrDefault(nums1[i], 0)+1);
			}
			for(int j=0;j<nums2.length;j++){
				mapNums2.put(nums2[j], mapNums2.getOrDefault(nums2[j], 0)+1);
			}
			for(Integer key:mapNums1.keySet()){	
				if(mapNums2.get(key)!=null){
				if(mapNums1.get(key)<=mapNums2.get(key)){
					count=mapNums1.get(key);
				}
				else{
					count=mapNums2.get(key);
				}
				for(int k=0;k<count;k++){
					list.add(key);
				}
			}
			
			}
			int[] returnArray = new int[list.size()];
			for(int i=0;i<list.size();i++){
				returnArray[i]=list.get(i);
			}
			return returnArray;
		}

}

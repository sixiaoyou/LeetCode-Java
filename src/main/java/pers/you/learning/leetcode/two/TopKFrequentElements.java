/*
LeetCode 347:Top K Frequent Elements
Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].

Note: 
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */



package pers.you.learning.leetcode.two;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

	  public List<Integer> topKFrequent(int[] nums, int k) {
			List<Integer> list=new ArrayList<Integer>();
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();

			
			for(int i=0;i<nums.length;i++){
				map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
			}
			
			List<Map.Entry<Integer, Integer>> mapList=new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
			

			mapList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
				public int compare(Map.Entry<Integer, Integer> o1,Map.Entry<Integer,Integer> o2){
					return o2.getValue() - o1.getValue();
				}
				
			});
			for(int h=0;h<k;h++){
				list.add(mapList.get(h).getKey());
			}
			return list;
	}

}

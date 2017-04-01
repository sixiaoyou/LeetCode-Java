/*
LeetCode 506:Relative Ranks
Given scores of N athletes, find their relative ranks and the people with the top three highest scores, who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".

Example 1:
Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
Note:
N is a positive integer and won't exceed 10,000.
All the scores of athletes are guaranteed to be unique.
 */
package pers.you.learning.leetcode.seventeentwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelativeRanks {
	
	public String[] findRelativeRanks(int[] nums) {
		List<Integer> nums1 = new ArrayList<Integer>();
		List<String> nums2 = new ArrayList<String>();
		Map<Integer,String> dict = new HashMap();
		nums2.add("Gold Medal");
		nums2.add("Silver Medal");
		nums2.add("Bronze Medal");
		for(int i=0;i<nums.length;i++){
			nums1.add(nums[i]);
		}
		Collections.sort(nums1);
		Collections.reverse(nums1);
		for(int j=0;j<nums1.size();j++){
			if(j>=3){
				dict.put(nums1.get(j),Integer.toString(j+1));
			}
			else{
				dict.put(nums1.get(j),nums2.get(j));
			}
		}
		String[] stringNums=new String[nums.length];
		for(int k=0;k<nums.length;k++){
			stringNums[k]=dict.get(nums[k]);
		}
		return stringNums;
    }
}

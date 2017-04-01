/*
LeetCode 503:Next Greater Element II
Example 1:
Input: [1,2,1]
Output: [2,-1,2]
Explanation: The first 1's next greater number is 2;
The number 2 can't find next greater number;
The second 1's next greater number needs to search circularly, which is also 2.
Note: The length of given array won't exceed 10000.
 */


package pers.you.learning.leetcode.seventeentwo;

import java.util.Arrays;

public class NextGreaterElementTwo {

	public int[] nextGreaterElements(int[] nums) {
		// TODO Auto-generated method stub
		int size = nums.length;
		int[] ans=new int[nums.length];
		Arrays.fill(ans, -1);
		for(int i=0;i<size;i++){
			for(int j=i+1;j%size!=i;j++){
				if(nums[j%size]>nums[i]){
					ans[i]=nums[j%size];
					break;
				}
				
			}
		}
		return ans;
	}

}

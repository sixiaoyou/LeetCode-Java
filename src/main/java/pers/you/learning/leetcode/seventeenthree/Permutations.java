/*
 网友实现：http://blog.csdn.net/happyaaaaaaaaaaa/article/details/51534048
LeetCode 46. Permutations
Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */




package pers.you.learning.leetcode.seventeenthree;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import junit.runner.Sorter.Swapper;

public class Permutations {
	
	  public List<List<Integer>> permute(int[] nums) {  
		  List<List<Integer>> res = new ArrayList<List<Integer>>();
		  ArrayList<Integer> temp = new ArrayList<Integer>();
		  dfs(res,nums,0);
		  return res;    
	  }
	  
	  public void dfs(List<List<Integer>> res,int[] nums,int j){
		  if(j==nums.length){
			  List<Integer> temp = new ArrayList<Integer>();
			  for(Integer num: nums)  temp.add(num); 
			  res.add(temp);
		  }
		  for(int i=j;i<nums.length;i++){
			 swap(nums,i,j);
			 dfs(res, nums, j+1);
			 swap(nums,i,j);
		  }
		  
	  }

	private void swap(int[] nums,int i,int j) {
		// TODO Auto-generated method stub
			int temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
	}

}

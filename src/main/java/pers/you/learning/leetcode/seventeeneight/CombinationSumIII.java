package pers.you.learning.leetcode.seventeeneight;

import java.util.ArrayList;
import java.util.List;

/*
'''
LeetCode216. Combination Sum III
Find all possible combinations of k numbers that add up to a number n, given that only numbers from 1 to 9 can be used and each combination should be a unique set of numbers.


Example 1:

Input: k = 3, n = 7

Output:

[[1,2,4]]

Example 2:

Input: k = 3, n = 9

Output:

[[1,2,6], [1,3,5], [2,3,4]]

'''
 */

//#【网友实现】:http://bookshadow.com/weblog/2015/05/24/leetcode-combination-sum-iii/


public class CombinationSumIII {
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public void search(int start,int cnt, int sums,List<Integer> nums,int k, int n) {
          
         if(cnt > k || sums > n ){
         return;
         }else if (cnt == k && sums == n) {
            ans.add(new ArrayList<Integer>(nums));
             return;
        }
        for (int i = start+1; i <= 9; i++) {
            nums.add(i);
            search(i,cnt + 1, sums + i,nums, k, n);
            nums.remove(nums.size()-1);
        }
    }
  public List<List<Integer>> combinationSum3(int k, int n){ 
         List<Integer> nums = new ArrayList<Integer>();
         search(0,0,0,nums,k,n);
         return ans;
    }  
}

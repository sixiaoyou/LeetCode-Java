/*
网友实现：http://bookshadow.com/weblog/2016/02/16/leetcode-increasing-triplet-subsequence/
LeetCode334:Increasing Triplet Subsequence
Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.

Formally the function should:
Return true if there exists i, j, k 
such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
Your algorithm should run in O(n) time complexity and O(1) space complexity.

Examples:
Given [1, 2, 3, 4, 5],
return true.

Given [5, 4, 3, 2, 1],
return false.
 */



package pers.you.learning.leetcode.seventeenthree;

public class IncreasingTripletSubsequence {
    
 public boolean increasingTriplet(int[] nums) {
        Integer a = null;
        Integer b = null;
        for(Integer i:nums){
            if(a==null||a>=i){
                a=i;
            }
            else if(b==null||b>=i){
                b=i;
            }
            else{
                return true;
            }
        }
        return false;
     }     
}

package pers.you.learning.leetcode.seventeeneight;

import java.util.Arrays;

/*
【网友实现】:https://leetcode.com/problems/permutation-in-string/discuss/
LeetCode567. Permutation in String
Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1. In other words, one of the first string's permutations is the substring of the second string.

Example 1:
Input:s1 = "ab" s2 = "eidbaooo"
Output:True
Explanation: s2 contains one permutation of s1 ("ba").
Example 2:
Input:s1= "ab" s2 = "eidboaoo"
Output: False
Note:
The input strings only contain lower case letters.
The length of both given strings is in range [1, 10,000].

 */

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int[] A = new int[l1];
        int[] B = new int[l2];
        for(int i = 0;i<l1;i++){
            A[i] = (int)s1.charAt(i)-97;
        }
        for(int j = 0;j<l2;j++){
            B[j] = (int)s2.charAt(j)-97;
        }
        int[] target = new int[26];
        for(Integer i:A){
            target[i]+=1;
        }
        int[] window = new int[26];
        for(int k = 0;k<l2;k++){
            window[B[k]]+=1;
            if(k>=l1){
                window[B[k-l1]]-=1;
            }
            if(Arrays.equals(window,target)){
                return true;
            }
            
        }
        return false;   
    }
    
}

/*
'''
LeetCode 459. Repeated Substring Pattern
Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.

Example 1:
Input: "abab"

Output: True

Explanation: It's the substring "ab" twice.
Example 2:
Input: "aba"

Output: False
Example 3:
Input: "abcabcabcabc"

Output: True

Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
'''
 */



package pers.you.learning.leetcode.seventeenthree;

public class RepeatedSubstringPattern {
    
    //网友实现：https://leetcode.com/problems/repeated-substring-pattern/#/solutions
    public boolean repeatedSubstringPatternV1(String s) {
        if(s.equals("")){
                return false;
            }
            String ss = (s+s).substring(1,s.length()*2-1);
            return ss.contains(s);
        }
}

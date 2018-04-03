package pers.you.learning.leetcode.eighteen;

import org.junit.Test;

/*
LeetCode796. Rotate String
We are given two strings, A and B.

A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.

Example 1:
Input: A = 'abcde', B = 'cdeab'
Output: true

Example 2:
Input: A = 'abcde', B = 'abced'
Output: false
 */


public class RotateString {
    public boolean rotateString(String A, String B) {
        for(int i = 0;i<A.length();i++){
            if((A.substring(i+1,A.length())+A.substring(0,i+1)).equals(B)){
                return true;
            }
        }
        return false;
    }
}

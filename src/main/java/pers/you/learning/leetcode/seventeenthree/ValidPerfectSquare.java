/*
'''
LeetCode367:Valid Perfect Square
Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True
Example 2:

Input: 14
Returns: False
'''
 */

package pers.you.learning.leetcode.seventeenthree;

public class ValidPerfectSquare {
    public boolean isPerfectSquareV1(int num) { 
        return (int)(Math.pow((double)num,0.5)-1)*(int)(Math.pow((double)num,0.5)+1)+1==num;
    }
    
    public boolean isPerfectSquareV2(int num) {
        String strNum = String.valueOf(Math.pow((double)num, 0.5));
        return strNum.substring(strNum.length()-1,strNum.length()).equals("0");
    }
}

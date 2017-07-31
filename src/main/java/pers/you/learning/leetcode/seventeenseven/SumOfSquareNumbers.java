package pers.you.learning.leetcode.seventeenseven;

/*
'''
LeetCode633. Sum of Square Numbers
Given a non-negative integer c, your task is to decide whether there're two integers a and b such that a2 + b2 = c.

Example 1:
Input: 5
Output: True
Explanation: 1 * 1 + 2 * 2 = 5
Example 2:
Input: 3
Output: False
'''
 */


public class SumOfSquareNumbers {
    public boolean isInteger(int s){
        return Math.pow((int)Math.sqrt(s),2) == s;
        
    }
    
    
    public boolean judgeSquareSum(int c) {
        if(isInteger(c)){
            return true;
        }else{
            int temp = (int)Math.sqrt(c);
            for(int i = temp;i>= 0;i--){
                if(isInteger(c-i*i)){
                    return true;
                }
            }
            return false;
        } 
        
    }
}

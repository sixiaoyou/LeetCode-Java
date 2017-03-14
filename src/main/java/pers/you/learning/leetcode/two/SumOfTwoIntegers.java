/*
LeetCode 371:Sum of Two Integers
 Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.
 */
package pers.you.learning.leetcode.two;

public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        int c;
        while(b!=0){
            c=a^b;
            b=(a&b)<<1;
            a=c;
        }
        return a;   
    }
}

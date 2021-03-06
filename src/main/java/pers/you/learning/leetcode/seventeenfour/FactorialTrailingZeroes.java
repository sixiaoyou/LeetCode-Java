package pers.you.learning.leetcode.seventeenfour;



/*
LeetCode 172: Factorial Trailing Zeroes
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.
 */

public class FactorialTrailingZeroes {
    public int trailingZeroesV1(int n) {
            long x=5;
            int sum=0;
            while(x<=n){
                sum+=n/x;
                x*=5;
            }
            return sum;
    }
    
    public int trailingZeroesV2(int n) {
        int log =(int)(Math.log(n)/Math.log(5));
        int sum=0;
        for(int i=1;i<log+1;i++){
            sum+=n/(int)Math.pow(5, i);
        }
        return sum;
    }
}

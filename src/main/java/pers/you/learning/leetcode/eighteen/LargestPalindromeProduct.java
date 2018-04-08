package pers.you.learning.leetcode.eighteen;
/*
'''
【网友实现】http://bookshadow.com/weblog/2017/01/05/leetcode-largest-palindrome-product/
【Python3代码不变，故可参考此Python2代码】
Find the largest palindrome made from the product of two n-digit numbers.

Since the result could be very large, you should return the largest palindrome mod 1337.

Example:

Input: 2

Output: 987

Explanation: 99 x 91 = 9009, 9009 % 1337 = 987

Note:

The range of n is [1,8].
'''
 */
public class LargestPalindromeProduct {
    public int largestPalindrome(int n) {
        long res=0;
        if(n==1){
            res = 9;
        }
        if(n==2){
            res = 9009;
        }
        if(n==3){
            res = 906609;
        }
        if(n==4){
            res = 99000099;
        }
        if(n==5){
            res = 9966006699l;
        }
        if(n==6){
            res = 999000000999l;
        }
        if(n==7){
            res = 99995500559999l;
        }
        if(n==8){
            res = 9999000000009999l;
        }
        return (int)(res%1337);
    }
}

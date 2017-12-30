package pers.you.learning.leetcode.twelve;

/*
LeetCode9.PalindromeNumber
Determine whether an integer is a palindrome. Do this without extra space.

click to show spoilers.
 */


public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int start = 0,end =s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start+=1;
            end-=1;
        }
        return true;
    }
}

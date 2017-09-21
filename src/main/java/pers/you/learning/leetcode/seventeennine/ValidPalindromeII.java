package pers.you.learning.leetcode.seventeennine;

/*
'''
【网友实现】
LeetCode680. Valid Palindrome II
Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

Example 1:
Input: "aba"
Output: True
Example 2:
Input: "abca"
Output: True
Explanation: You could delete the character 'c'.
Note:
The string will only contain lowercase characters a-z. The maximum length of the string is 50000.
'''
 */

public class ValidPalindromeII {

    public boolean helper(char[] charS,int start,int end,boolean flag){
        if(start>=end){
            return true;
        }
        while(start<end){
            if(charS[start] == charS[end]){
                start++;
                end--;
            }else{
                if(flag){
                  return false;
                }
                break;
            }
            
        }
        return helper(charS,start+1,end,true) || helper(charS,start,end-1,true);
    }
    
    
    public boolean validPalindromeV1(String s) {
        char[] charS = s.toCharArray();
        return helper(charS,0,charS.length-1,false);
    }
    
    public boolean validPalindromeV2(String s) {
        int l = s.length();
        boolean r = true;
        String res = new StringBuilder(s).reverse().toString();
        if(s.equals(res)){
            return true;
        }
        for(int i = 0;i < l;i++){
            if(s.charAt(i)!=s.charAt(l-i-1)){
                 r = s.substring(i+1,l-i).equals(res.substring(i,l-i-1))||s.substring(i,l-i-1).equals(res.substring(i+1,l-i));
                break;
            }
        }
        return r;
    }

}

package pers.you.learning.leetcode.seventeenseven;

/*
LeetCode125. Valid Palindrome
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
 */



public class ValidPalindrome {
    public boolean  isAlphanumeric(Character c){
        return Character.isAlphabetic(c)||Character.isDigit(c);
    }
    
    
    public boolean isPalindrome(String s) {
        int length = s.length()-1;
        int start = 0;
        int end = length;
        while(start<=end){
            while(start<length&&!isAlphanumeric(s.charAt(start))){
                start++;
            }
            while(end>0&&!isAlphanumeric(s.charAt(end))){
                end--;
            }
            if(isAlphanumeric(s.charAt(start))&&
                              isAlphanumeric(s.charAt(end))&&
                                             Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;      
                                  }
        return true;
    }
}

/*
LeetCode151:Reverse Words in a String
Given an input string, reverse the string word by word.

For example,
Given s = "the sky is blue",
return "blue is sky the".
 */

package pers.you.learning.leetcode.seventeenfive;

public class ReverseWordsInAString {
  public String reverseWords(String s) {
      String[] s1 = s.split(" ");
      StringBuilder s2 = new StringBuilder();
      for(int i=s1.length-1;i>=0;i--){
          if(!s1[i].trim().isEmpty()){
              s2.append(s1[i]+" ");
          }
      }
      return s2.toString().trim();
      } 
}

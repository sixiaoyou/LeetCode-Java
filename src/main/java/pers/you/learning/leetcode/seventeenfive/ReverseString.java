/*
LeetCode344:Reverse String
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
 */

package pers.you.learning.leetcode.seventeenfive;

public class ReverseString {

    //【网友实现】https://discuss.leetcode.com/topic/43296/java-simple-and-clean-with-explanations-6-solutions
    public String reverseStringV1(String s) {
        char[] word = s.toCharArray();
          int i = 0;
          int j = s.length() - 1;
          while (i < j) {
              char temp = word[i];
              word[i] = word[j];
              word[j] = temp;
              i++;
              j--;
          }
          return new String(word);
      }
    
  public String reverseStringV2(String s) {
        StringBuilder re = new StringBuilder();
        char[] charS = s.toCharArray();
        for(int i=charS.length;i>=0;i--){
            re.append(charS[i]);
        }
        return re.toString();
    }
}

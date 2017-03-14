/*
 LeetCode 520:Detect Capital
 Given a word, you need to judge whether the usage of capitals in it is right or not.

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital if it has more than one letter, like "Google".
Otherwise, we define that this word doesn't use capitals in a right way.
Example 1:
Input: "USA"
Output: True
Example 2:
Input: "FlaG"
Output: False
Note: The input will be a non-empty word consisting of uppercase and lowercase latin letters.
 */


package pers.you.learning.leetcode.two;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
		String str = "sdfsdSADASJLK";
		String lowerStr=str.toLowerCase();
		String upperStr=str.toUpperCase();
		String subStr=str.substring(1);
		String lowerSubStr=subStr.toLowerCase();
		boolean ok=false;
		
		if (str.equals(lowerStr) || str.equals(upperStr) || subStr.equals(lowerSubStr)){
			ok=true;
		}
	return ok;
	}

}

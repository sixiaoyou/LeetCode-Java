/**
 LeetCode 500. Keyboard Row
 Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.


American keyboard


Example 1:
Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]
Note:
You may use one character in the keyboard more than once.
You may assume the input string will only contain letters of alphabet.
 */
package pers.you.learning.leetcode.seventeentwo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KeyBoardRow {
	public class Solution {
	    public String[] findWords(String[] words) {
	        String  words1="QWERTYUIOP";
			String words2="ASDFGHJKL";
			String  words3="ZXCVBNM";
			String upperWords="";
			List<String> words4 = new ArrayList<String>();
			List<String> removeWords = new ArrayList<String>();
			List<String> finalList=new ArrayList<String>();
			for(int i=0;i<words.length;i++){
				words4.add(words[i]);
			}
			for(String j : words4){
				List distinctUpperWords=new ArrayList();
				 upperWords=j.toUpperCase();
				 char[] charUpperWords=upperWords.toCharArray();
				 for(int k=0;k<charUpperWords.length;k++){
					 if(!distinctUpperWords.contains(charUpperWords[k])){
						 distinctUpperWords.add(charUpperWords[k]);
					 }
				 }
				for(int i=0;i<distinctUpperWords.size()-1;i++){
		        	boolean ok=true;
					if(words1.indexOf(distinctUpperWords.get(i).toString())!=-1){
						for(int s=0;s<words1.length();s++){
							if(words1.indexOf(distinctUpperWords.get(i+1).toString())==-1){
								ok=false;
							}
						}
					}
					else if(words2.indexOf(distinctUpperWords.get(i).toString())!=-1){
						for(int s=0;s<words2.length();s++){
							if(words2.indexOf(distinctUpperWords.get(i+1).toString())==-1){
								ok=false;
							}
						}
					}
					else if(words3.indexOf(distinctUpperWords.get(i).toString())!=-1){
						for(int s=0;s<words3.length();s++){
							if(words3.indexOf(distinctUpperWords.get(i+1).toString())==-1){
								ok=false;
							}
						}
					}
				if(!ok){
					removeWords.add(j);
					}
						}
					}
			for(int a=0;a<removeWords.size();a++){
				if (!finalList.contains(removeWords.get(a))){
					finalList.add(removeWords.get(a));
				}
			}
	    	for(int b=0;b<finalList.size();b++){
					words4.remove(finalList.get(b));
				}
		String[] finalWords = words4.toArray(new String[words4.size()]); 
		return finalWords;
		    }
	    }
}
	


package pers.you.learning.leetcode.eighteen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
'''
LeetCode819. Most Common Word
Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer is unique.

Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.

Example:
Input:
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
Output: "ball"
Explanation:
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph.
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"),
and that "hit" isn't the answer even though it occurs more because it is banned.


Note:

1 <= paragraph.length <= 1000.
1 <= banned.length <= 100.
1 <= banned[i].length <= 10.
The answer is unique, and written in lowercase (even if its occurrences in paragraph may have uppercase symbols, and even if it is a proper noun.)
paragraph only consists of letters, spaces, or the punctuation symbols !?',;.
Different words in paragraph are always separated by a space.
There are no hyphens or hyphenated words.
Words only consist of letters, never apostrophes or other punctuation symbols.
'''

 */


public class MostCommonWord {
    public boolean contains(String[] array,String s){
        for(String str:array){
                if(str.equals(s)){
                        return true;
                }
        }
        return false;
}
    
    public String mostCommonWord(String paragraph, String[] banned) {
    String r = "";
    Map<String,Integer> map = new HashMap<String,Integer>();
        String[] array = paragraph.split("\\!|\\?|\\'|\\,|\\;|\\.|\\s+");
        for(String s:array){
        String ls = s.toLowerCase();
        if(!ls.equals("")){
        map.put(ls, map.getOrDefault(ls, 0)+1);
                // System.out.println(s.toLowerCase());
                }
    }
         List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());  
     Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {  
         //降序排序  
         public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {  
             //return o1.getValue().compareTo(o2.getValue());  
             return o2.getValue().compareTo(o1.getValue());  
         }  
     });  
     for(Map.Entry<String,Integer> kv:list){
         if(!contains(banned, kv.getKey())){
            
                 r = kv.getKey();
             break;
         }
     }
        return r;
        }
}

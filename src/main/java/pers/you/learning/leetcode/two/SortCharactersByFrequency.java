/*
LeetCode 451:Sort Characters By Frequency
 
 Given a string, sort it in decreasing order based on the frequency of characters.

Example 1:

Input:
"tree"

Output:
"eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
Example 2:

Input:
"cccaaa"

Output:
"cccaaa"

Explanation:
Both 'c' and 'a' appear three times, so "aaaccc" is also a valid answer.
Note that "cacaca" is incorrect, as the same characters must be together.
Example 3:

Input:
"Aabb"

Output:
"bbAa"

Explanation:
"bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 */
package pers.you.learning.leetcode.two;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharactersByFrequency {
	 public String frequencySort(String s) {
	       Map<Character,Integer> map = new HashMap();
	       for(int i=0;i<s.length();i++){
	           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
	       }
	       List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(map.entrySet());
	       list.sort(new Comparator<Map.Entry<Character,Integer>>(){
	           public int compare(Map.Entry<Character,Integer> o1,Map.Entry<Character,Integer> o2){
	               return o2.getValue() - o1.getValue();
	               
	            }
	           });
	        StringBuffer s1 = new StringBuffer();
	        
	        for(Map.Entry<Character,Integer> e : list){
	            for(int j=0;j<e.getValue();j++){
	                s1.append(e.getKey());
	            }
	        }
	        return s1.toString();
	       }	
	}



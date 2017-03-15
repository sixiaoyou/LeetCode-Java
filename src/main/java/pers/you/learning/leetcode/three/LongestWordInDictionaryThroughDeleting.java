/*
LeetCode 524. Longest Word in Dictionary through Deleting
Given a string and a string dictionary, find the longest string in the dictionary that can be formed by deleting some characters of the given string. If there are more than one possible results, return the longest word with the smallest lexicographical order. If there is no possible result, return the empty string.

Example 1:
Input:
s = "abpcplea", d = ["ale","apple","monkey","plea"]

Output: 
"apple"
Example 2:
Input:
s = "abpcplea", d = ["a","b","c"]

Output: 
"a"
Note:
All the strings in the input will only contain lower-case letters.
The size of the dictionary won't exceed 1,000.
The length of all the strings in the input won't exceed 1,000.
 */



package pers.you.learning.leetcode.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LongestWordInDictionaryThroughDeleting {
	
	public boolean isFormed(String j,String s){
		boolean ok = true;
		Queue <Character> queue = new LinkedList<Character>();
		for(int i=0;i<j.length();i++){
			queue.add(j.charAt(i));
		}
		for(int k=0;k<s.length();k++){
			if(!queue.isEmpty()){
				if(s.charAt(k)==queue.peek()){
					queue.poll();
				}
			}
		}
		if(queue.isEmpty()){
			ok=false;
		}
		return ok;
	}
	
	public  List<String> sortMapByValue(Map<String, Integer> map){
		List<Map.Entry<String, Integer>> mapList = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		List<String> list = new ArrayList<String>();
		mapList.sort(new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,Map.Entry<String, Integer> o2){
				return o2.getValue() - o1.getValue();
			}
		});
		
		 for(int h=0;h<mapList.size();h++){
				list.add(mapList.get(h).getKey());
			}
		return list;
	}
	
	 public String findLongestWord(String s, List<String> d) {
		 Map<String, Integer> map = new HashMap<String, Integer>();
		 List<String> reStrings =new ArrayList<String>();
		 List<String> resStrings =new ArrayList<String>();
		 List<String> sortList =new ArrayList<String>();
		 
		 String returnString ="";
		 for(String string:d){
			 if(!isFormed(string, s)){
				 reStrings.add(string);
			 }
		 }
		 for(String reString:reStrings){
			 map.put(reString, reString.length());
		 	}       
		 sortList= sortMapByValue(map);
		 for(String fin:sortList){
			 if(fin.length()==sortList.get(0).length()){;
				 resStrings.add(fin);
			 }
		 }
		 Collections.sort(resStrings);
		 if(!resStrings.isEmpty()){
			 returnString=resStrings.get(0);
		 }
		return returnString; 
	 }
}

package pers.you.learning.leetcode.seventeenfour;

/*
 LeetCode 49:Group Anagrams
Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */




import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public List<List<String>> groupAnagramsV1(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        List<List<String>> finalList = new ArrayList<List<String>>();
        for (String s : strs) {
            List<Character> list = new ArrayList<Character>();
            for (int i = 0; i < s.length(); i++) {
                list.add(s.charAt(i));
            }
            Collections.sort(list);
            String b = "";
            for (Character c : list) {
                b += c;
            }
            if (map.get(b) == null) {
                map.put(b, new ArrayList<String>());
                map.get(b).add(s);
            } else {
                map.get(b).add(s);
            }
        }
        for(List<String> l:map.values()){
            finalList.add(l);
        }
        return finalList;
    }
    
    
    //网友实现:http://www.thinksaas.cn/topics/0/395/395469.html
    public List<List<String>> groupAnagramsV2(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        List<List<String>> returnList = new ArrayList<List<String>>();
        for(String str:strs){
         char[] charStr = str.toCharArray();
         Arrays.sort(charStr);
         String b = new String(charStr);
         List<String> list = map.get(b);
         if(list == null){
             list=new ArrayList<String>();
         }
         list.add(str);
         map.put(b,list);
        }
        
        
         for(List<String> L:map.values()){
             returnList.add(L);
         }
         return returnList;
        }
}

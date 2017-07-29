package pers.you.learning.leetcode.seventeenseven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


/*
'''
LeetCode14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
'''
 */

public class LongestCommonPrefix {
    
//    【网友实现】https://discuss.leetcode.com/topic/27913/sorted-the-array-java-solution-2-ms
    public String longestCommonPrefixV1(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        StringBuilder s = new StringBuilder();
        Arrays.sort(strs);
        char[] charA = strs[0].toCharArray();
        char[] charB = strs[strs.length-1].toCharArray();
        
        int a = charA.length,b = charB.length; 
        for(int i = 0;i<a;i++){
            if(b>i&&charB[i] == charA[i]){
                s.append(charA[i]);
            }else{
                return s.toString();
            }
        }
         return s.toString();
         
      }
    
    
    
    
    public String[] sortArrayByLength(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                String temp;
                if (array[i].length() > array[j].length()) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
    
    
    public boolean isCommonPrefix(List<String> list,String str,int end){
        for(int i =0;i<list.size();i++){
            if(!str.substring(0,end).equals(list.get(i).substring(0, end))){
                return false;
            }
        }
        return true;
    }
    
   public String longestCommonPrefixV2(String[] strs) {
       Set<String> set = new HashSet<String>();
       List<String> list = new ArrayList<String>();
       if(strs.length==0){
           return "";
       }
       String[] sortStrs = sortArrayByLength(strs);
       int end = sortStrs[0].length();
       for(int i = 0;i<sortStrs.length;i++){
           if(!sortStrs[i].equals(sortStrs[0])){
           set.add(sortStrs[i]);
           }
       }
       for(String s:set){
           list.add(s);
       }
       while(end>=0){
           if(isCommonPrefix(list, sortStrs[0], end)){
               return sortStrs[0].substring(0, end);
           }
           end-=1;
       }
       return "";    
    }
   
   
   
}

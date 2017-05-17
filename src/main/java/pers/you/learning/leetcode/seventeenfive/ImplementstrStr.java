/*
LeetCode28:Implement strStr()
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */



package pers.you.learning.leetcode.seventeenfive;

import org.junit.Test;

public class ImplementstrStr {
    public int strStrV1(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
    
    //【极客学院版】实现细节清晰,非考察Api的调用.
    public int strStrV2(String haystack, String needle){
            int m = haystack.length();
            int n = needle.length();
            if(needle.length()==0){
                return 0;
            }
  
            for(int i=0;i<m;i++){
                int count=0;
                for(int j=0;j<n&&i+j<n;j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        break;
                    }
                    else{
                        count++;
                    }
                }
                if(count==n){
                    return i;
                }
                        
            }
            return -1;        
    }
    
}

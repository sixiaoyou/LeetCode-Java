package pers.you.learning.leetcode.eighteen;

/*
'''
LeetCode165. Compare Version Numbers
Compare two version numbers version1 and version2.
If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Example 1:

Input: version1 = "0.1", version2 = "1.1"
Output: -1
Example 2:

Input: version1 = "1.0.1", version2 = "1"
Output: 1
Example 3:

Input: version1 = "7.5.2.4", version2 = "7.5.3"
Output: -1

'''
 */

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] l1 = version1.split("\\.");
        String[] l2 = version2.split("\\.");
        int a = 0,b=0;
        for(int i=0;i<Math.max(l1.length,l2.length);i++){
            if(i<l1.length){
                a = Integer.parseInt(l1[i]);
            }else{
                a=0;
            }
            if(i<l2.length){
                b=Integer.parseInt(l2[i]);
            }else{
                b=0;
            }
            
            if(a>b) return 1;
            if(a<b) return -1;
        }
        return 0;
    }
}

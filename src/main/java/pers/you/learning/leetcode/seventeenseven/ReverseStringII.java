package pers.you.learning.leetcode.seventeenseven;

/*
'''
LeetCode541. Reverse String II
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
'''
 */


public class ReverseStringII {
    StringBuilder sb = new StringBuilder();

    public StringBuilder subReverseStr(char[] charArray, int start, int end) {
        for (int i = end - 1; i >= start; i--) {
            sb.append(charArray[i]);
        }
        return sb;
    }

//    【网友实现】:http://bookshadow.com/weblog/2017/03/12/leetcode-reverse-string-ii/
    public String reverseStrV1(String s, int k) {
        int size = s.length();
        double round = Math.ceil(size/(2.0*k));
        char[] charArray = s.toCharArray();
        if(k>size){
            return subReverseStr(charArray,0,size).toString();
        }
        for(int i=0;i<(int)round;i++){
               if((i*2*k+k)>size){
                 subReverseStr(charArray,i*2*k,size);
                 return sb.toString();
               }
                subReverseStr(charArray,i*2*k,i*2*k+k);
                   if((i+1)*2*k<=size){
                sb.append(s.substring(i*2*k+k,(i+1)*2*k));
            }else{
                sb.append(s.substring(i*2*k+k,size));
            }   
            
        }
                return sb.toString();
    }
    
    
    public String reverseStrV2(String s, int k) {
        int size = s.length();
        char[] charArray = s.toCharArray();
        if(k==1){
            return s;
        }else if(size<k){
            return subReverseStr(charArray,0,size).toString();
        }else if(size>=k&&size<2*k){
            return subReverseStr(charArray,0,k).toString()+s.substring(k,size);
        }else{
            int start = 0;
            int end = 2*k-1;
            while(end<=size){
                subReverseStr(charArray,start,start+k).toString();
                sb.append(s.substring(start+k,start+2*k));
                int ans = size - end - 1;
                if(ans<k){
                    return subReverseStr(charArray,end+1,size).toString();
                }
                if(ans>=k&&ans<2*k){
                    return subReverseStr(charArray,end+1,end+1+k).toString()+s.substring(end+1+k,size);
                }
                start+=2*k;
                end+=2*k;
            }
            return sb.toString();
           
            
        }
    }
}

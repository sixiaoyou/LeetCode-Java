/*
网友实现：http://bookshadow.com/weblog/2016/10/09/leetcode-add-strings/
LeetCode 415:Add Strings
Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

Note:

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */



package pers.you.learning.leetcode.three;

import java.util.ArrayList;
import java.util.List;

public class AddStrings {
	public String addStrings(String num1, String num2) {
       	List<String> list = new ArrayList<String>();
    	StringBuffer returnString = new StringBuffer();
    	int idx1=num1.length();
    	int idx2=num2.length();
    	int carry=0;
    	int digit=0;
    	while(idx1!=0 || idx2!=0 || carry!=0){
    		digit=carry;
    		if(idx1!=0){
    			idx1-=1;
    			digit+=Integer.parseInt(String.valueOf(num1.charAt(idx1)));
    		}
    		if(idx2!=0){
    			idx2-=1;
    			digit+=Integer.parseInt(String.valueOf(num2.charAt(idx2)));
    		}
    		if(digit>9){
    			carry=1;
    		}
    		else{
    			carry=0;
    		}
    		list.add(String.valueOf(digit%10));
    	}
    	for(int i=list.size()-1;i>=0;i--){
    		returnString.append(list.get(i));
    	}
        return returnString.toString();
    }
}

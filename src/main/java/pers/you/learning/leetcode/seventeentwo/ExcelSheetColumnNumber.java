package pers.you.learning.leetcode.seventeentwo;

/*
LeetCode 171:Excel Sheet Column Number
Related to question Excel Sheet Column Title

Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28 
 */


public class ExcelSheetColumnNumber {

    public int titleToNumber(String s) {
			int sum=0;
			char[] charS = s.toCharArray();
			for(int i=0;i<charS.length;i++){
				sum+=((int)charS[i]-64)*(int)(Math.pow(26,charS.length-i-1));
			}
        return sum;
    }

}

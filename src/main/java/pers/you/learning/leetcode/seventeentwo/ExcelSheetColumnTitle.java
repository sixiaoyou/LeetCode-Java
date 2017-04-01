/*
 Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 */


package pers.you.learning.leetcode.seventeentwo;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        String returnS="";
		while(n>0){
			returnS=(char)(65+(n-1)%26)+returnS;
			n=(n-1)/26;
		}
	   return returnS;
        
    }
}

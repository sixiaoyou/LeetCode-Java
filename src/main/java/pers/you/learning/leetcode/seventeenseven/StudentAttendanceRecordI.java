package pers.you.learning.leetcode.seventeenseven;


/*
'''
Leet551. Student Attendance Record I
You are given a string representing an attendance record for a student. The record only contains the following three characters:

'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

Example 1:
Input: "PPALLP"
Output: True
Example 2:
Input: "PPALLL"
Output: False

'''

 */

public class StudentAttendanceRecordI {
    public class Solution {
        public boolean checkRecordV1(String s) {
            int countA = 0;
            int countL = 0;
            int index = -1;
            char[] charS = s.toCharArray();
            for(int i = 0; i<charS.length;i++){
                if(charS[i]=='A'){
                    countA+=1;
                }
                if(countA>1){
                    return false;
                }
                if(charS[i]=='L'){
                    if(index==-1){
                        index = i;
                    }else if(i-index==1){
                            countL+=1;
                            index = i;
                        }else{
                        index = i;
                        countL = 0;
                        }
                    } 
                if(countL>1){
                    return false;
                    }     
                }
            return true;
            }       
        
        
        public boolean checkRecordV2(String s) {
            int count = 0;
            char[] charS = s.toCharArray();
            for(Character c:charS){
                if(c == 'A'){
                    count+=1;
                }
            }
            return count<=1 && !s.contains("LLL");
        }
    }
}

package pers.you.learning.leetcode.seventeenfour;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int count=0;
        int flag=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count+=1;
                flag=1;
            }
            else{
                if(flag==1){
                    break;
                }
            }
        }
        return count; 
    }
}

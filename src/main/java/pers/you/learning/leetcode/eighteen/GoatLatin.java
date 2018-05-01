package pers.you.learning.leetcode.eighteen;

/*
A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.
 
If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".
 
Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin. 

 

Example 1:

Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 

Notes:

S contains only uppercase, lowercase and spaces. Exactly one space between each word.
1 <= S.length <= 150.
*/

public class GoatLatin {
    public boolean isExisted(Character c){
        char[] cs ={'a','e','i','o','u','A','E','I','O','U'};
        for(Character c1:cs){
            if(c==c1){
                return true;
            }
        }
        return false;
    }
    
    
    public String toGoatLatin(String S) {
        String[] ls = S.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<ls.length;i++){
            if(!isExisted(ls[i].charAt(0))){
                ls[i] = ls[i].substring(1,ls[i].length())+ls[i].substring(0,1);
            }  
            sb.append(ls[i]);
            sb.append("ma");
            for(int j = 0;j<i+1;j++){
                sb.append("a");
            }
            if(i!=ls.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

package pers.you.learning.leetcode.seventeeneight;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * LeetCode648. Replace Words
 In English, we have a concept called root, which can be followed by some other words to form another longer word - let's call this word successor. For example, the root an, followed by other, which can form another word another.

Now, given a dictionary consisting of many roots and a sentence. You need to replace all the successor in the sentence with the root forming it. If a successor has many roots can form it, replace it with the root with the shortest length.

You need to output the sentence after the replacement.

Example 1:
Input: dict = ["cat", "bat", "rat"]
sentence = "the cattle was rattled by the battery"
Output: "the cat was rat by the bat"
Note:
The input will only have lower-case letters.
1 <= dict words number <= 1000
1 <= sentence words number <= 1000
1 <= root length <= 100
1 <= sentence words length <= 1000

 */

public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
    StringBuilder sb = new StringBuilder();
    Map<Character,Integer> map = new HashMap<Character,Integer>();
    Collections.sort(dict);
    for(int i = 0;i<dict.size();i++){
        if(map.get(dict.get(i).charAt(0)) == null ){
            map.put(dict.get(i).charAt(0),i);
        }else{
            dict.remove(i);
        }
    }
    String[] array = sentence.split(" ");
    for(int i = 0;i<array.length;i++){
        for(int j = 0;j<dict.size();j++){
            int length = dict.get(j).length();
            if(array[i].length() >= length && array[i].substring(0,length).equals(dict.get(j))){
                array[i] = dict.get(j);
            }            
        }
    }
    for(int s = 0;s<array.length;s++){
        sb.append(array[s]);
        if(s<array.length-1){
            sb.append(" ");
        }
    }
    return sb.toString(); 
}
}

package pers.you.learning.leetcode.eighteen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.omg.Messaging.SyncScopeHelper;

public class ATest {
    
    @Test
    public void test(){
        String[] words = {"gin", "zen", "gig", "msg"};
       Character[] a={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
       String[] b={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       Map<Character, String> map = new HashMap<Character, String>();
       StringBuilder sBuilder = new StringBuilder();
       Set<String> set = new HashSet<String>();
       for(int i=0;i<a.length;i++){
           map.put(a[i], b[i]);
       }
       for(String s:words){
           for(int i=0;i<s.length();i++){
               sBuilder.append(map.get(s.charAt(i)));
           }
      set.add(sBuilder.toString());
            
            sBuilder=new StringBuilder();   
     
       }
       System.out.println(set.size());
       for(String s:set){
           System.out.println(s);
       }
    }

}

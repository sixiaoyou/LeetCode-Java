package pers.you.learning.leetcode.seventeenfive;

import javax.print.attribute.standard.RequestingUserName;

import org.junit.Test;

public class CountAndSay {
public String countAndSay(int n) {
        if(n<=0){
            return "";
        }else if(n==1){
            return "1";
        }else if(n==2){
            return "11";
        }else{
            String str = "11";
            StringBuilder sb = new StringBuilder();
            for(int i=3;i<=n;i++){
                char temp = str.charAt(0);
                int count = 1;
                for(int j=1;j<str.length();j++){
                    if(str.charAt(j)==temp){
                        count++;
                    }else{
                        sb.append(count).append(temp);
                        count=1;
                        temp=str.charAt(j);
                    }
                }
                sb.append(count).append(temp);
                str = sb.toString();
                sb.delete(0, sb.length());    
            }
            return str;
        }

    }

@Test
public void test(){
    System.out.println(countAndSay(3));
}

}

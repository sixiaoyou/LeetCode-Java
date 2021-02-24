package pers.you.learning.leetcode.eighteen;


//test
public class MergeStringsAlternately {
	 public String mergeAlternately(String word1, String word2) {
			StringBuilder sb = new StringBuilder();
			int l1 = word1.length();
			int l2 = word2.length();
			int min = Math.min(l1, l2);
			for(int i=0;i<min;i++){
				sb.append(word1.charAt(i));
				sb.append(word2.charAt(i));
			}
			if(l1>l2){
				for(int i=l2;i<l1;i++){
					sb.append(word1.charAt(i));
				}
			}else if(l1<l2){
				for(int i=l1;i<l2;i++){
					sb.append(word2.charAt(i));
				}
			}
			return(sb.toString());
	    }
}

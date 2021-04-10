package pers.you.learning.leetcode.march;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountItemsMatchingaRule {
	  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
          Map<String,Integer> map = new HashMap<String,Integer>();
          map.put("type",0);
          map.put("color",1);
          map.put("name",2);
          int cnt = 0;
          for(List<String> i:items){
              if(i.get(map.get(ruleKey)).equals(ruleValue)){
                  cnt+=1;
              }
          }
  return cnt;
  }
}

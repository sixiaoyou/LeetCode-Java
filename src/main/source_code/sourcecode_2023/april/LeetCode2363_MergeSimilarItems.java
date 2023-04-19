package sourcecode_2023.april;
import java.util.List;

/*
[LeetCode942. DI String Match]
A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

s[i] == 'I' if perm[i] < perm[i + 1], and
s[i] == 'D' if perm[i] > perm[i + 1].
Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.



Example 1:

Input: s = "IDID"
Output: [0,4,1,3,2]
Example 2:

Input: s = "III"
Output: [0,1,2,3]
Example 3:

Input: s = "DDI"
Output: [3,2,0,1]


Constraints:

1 <= s.length <= 105
s[i] is either 'I' or 'D'.
 */

import java.util.*;

public class LeetCode2363_MergeSimilarItems {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.april.LeetCode2363_MergeSimilarItems
     * @CreateTime: 2023/4/19
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
            List<int[]> l = new ArrayList<int[]>();

            for(int[]t: items1){
                l.add(t);
            }

            for(int[]t2: items2){
                l.add(t2);
            }

            Collections.sort(l, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {

                    return o1[0] - o2[0];
                }
            });


            int count = 0, length = l.size();
            List<List<Integer>> res = new ArrayList<List<Integer>>();

            while(count < length){
                int[] atmp1 = l.get(count);
                if(count < length - 1){
                    int[] atmp2 = l.get(count + 1);
                    if(atmp1[0] == atmp2[0]){
                        res.add(Arrays.asList(atmp1[0], atmp1[1] + atmp2[1]));
                        count += 2;
                        continue;
                    }

                }

                if(count <= length - 1){
                    res.add(Arrays.asList(atmp1[0], atmp1[1]));
                }
                count += 1;
            }

            return res;
        }

    }
}

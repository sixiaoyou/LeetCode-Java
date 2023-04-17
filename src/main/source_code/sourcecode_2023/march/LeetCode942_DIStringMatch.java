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




package sourcecode_2023.march;

import java.util.ArrayList;
import java.util.List;

public class LeetCode942_DIStringMatch {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.march
     * @CreateTime: 2023/4/17
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class SolutionV1 {
        public int[] diStringMatch(String s) {

            int sl = s.length(), count = 0 , rcount = 0;
            List<Integer> lres = new ArrayList<Integer>();

            for(int i = 0; i < sl; i++){
                if(s.charAt(i) == 'I'){
                    lres.add(count);
                    count += 1;
                }else{
                    lres.add(sl - rcount);
                    rcount += 1;
                }
            }

            int lnum = s.charAt(sl - 1) == 'I' ? count : sl - rcount;
            lres.add(lnum);
            int[] res = new int[sl + 1];
            for(int j = 0; j < lres.size(); j++ ){
                res[j] = lres.get(j);
            }

            return res;

        }
    }

    class SolutionV2 {
        public int[] diStringMatch(String s) {

            int j = 0;
            int sl = s.length();
            int k = sl, l = sl;
            int[] res = new int[sl + 1];



            for(int i = 0; i < sl; i++ ){

                if(s.charAt(i) == 'I'){
                    res[i] = j;
                    j += 1;
                }else{
                    res[i] = k;
                    k -= 1;
                }

            }

            res[sl] = j;
            return res;

        }
    }

    class SolutionV3 {
        public int[] diStringMatch(String s) {

            int n = s.length();
            int minl = 0, maxl = n;
            int[] res = new int[n + 1];
            char[] cs = s.toCharArray();

            for(int i = 0; i < n; i++){
                res[i] = cs[i] == 'I' ? minl++ : maxl--;
            }

            res[n] = minl;
            return res;

        }
    }


}

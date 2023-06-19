/*
[1122. Relative Sort Array]
Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.



Example 1:

Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]
Example 2:

Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]


Constraints:

1 <= arr1.length, arr2.length <= 1000
0 <= arr1[i], arr2[i] <= 1000
All the elements of arr2 are distinct.
Each arr2[i] is in arr1.
 */

package sourcecode_2023.May;

import java.util.*;

public class LeetCode1122_RelativeSortArray {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/7
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public int[] relativeSortArray(int[] arr1, int[] arr2) {
            Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
            Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

            List<Integer> o = new ArrayList<Integer>();

            for(int i = 0; i < arr2.length; i++){
                map1.put(arr2[i], i);

            }


            for(int j = 0; j < arr1.length; j++){
                if(map1.get(arr1[j]) != null){
                    map2.put(arr1[j], map2.getOrDefault(arr1[j], 0) + 1);
                }else{
                    o.add(arr1[j]);
                }
            }

            int l1 = o.size();
            Collections.sort(o);

            for(int k = 0; k < arr2.length; k++){
                for(int l = 0; l < map2.get(arr2[k]); l++){
                    o.add(arr2[k]);
                }
            }

            int l2 = o.size();
            int[] ares = new int[l2];

            for(int m = l1; m < l2; m++){
                ares[m - l1] = o.get(m);
            }

            for(int n = 0; n < l1; n++){
                ares[l2 - l1 + n] = o.get(n);
            }

            return ares;

        }
    }

}

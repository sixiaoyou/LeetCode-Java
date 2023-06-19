/*
[2418. Sort the People]
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.



Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.


Constraints:

n == names.length == heights.length
1 <= n <= 103
1 <= names[i].length <= 20
1 <= heights[i] <= 105
names[i] consists of lower and upper case English letters.
All the values of heights are distinct.
 */

package sourcecode_2023.May;

import java.util.*;

public class LeetCode2418_SortThePeople {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.may
     * @CreateTime: 2023/5/11
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    class Solution {
        public String[] sortPeople(String[] names, int[] heights) {
            Map<Integer, String> map = new HashMap<Integer, String>();

            for (int i = 0; i < heights.length; i++) {
                map.put(heights[i], names[i]);
            }


            List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());

            Collections.sort(list, new MyComparator());
            String[] res = new String[names.length];

            for (int j = 0; j < list.size(); j++) {
                res[j] = list.get(j).getValue();
            }
            return res;
        }
    }

    class MyComparator implements Comparator<Map.Entry> {
        public int compare(Map.Entry o1, Map.Entry o2) {
            return (Integer) o2.getKey() - (Integer) o1.getKey();
        }
    }


}

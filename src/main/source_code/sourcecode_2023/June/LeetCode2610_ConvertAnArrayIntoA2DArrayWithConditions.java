package sourcecode_2023.June;

/*
[2610. Convert an Array Into a 2D Array With Conditions]
You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:

The 2D array should contain only the elements of the array nums.
Each row in the 2D array contains distinct integers.
The number of rows in the 2D array should be minimal.
Return the resulting array. If there are multiple answers, return any of them.

Note that the 2D array can have a different number of elements on each row.



Example 1:

Input: nums = [1,3,4,1,2,3,1]
Output: [[1,3,4,2],[1,3],[1]]
Explanation: We can create a 2D array that contains the following rows:
- 1,3,4,2
- 1,3
- 1
All elements of nums were used, and each row of the 2D array contains distinct integers, so it is a valid answer.
It can be shown that we cannot have less than 3 rows in a valid array.
Example 2:

Input: nums = [1,2,3,4]
Output: [[4,3,2,1]]
Explanation: All elements of the array are distinct, so we can keep all of them in the first row of the 2D array.


Constraints:

1 <= nums.length <= 200
1 <= nums[i] <= nums.length
 */


import java.util.*;

public class LeetCode2610_ConvertAnArrayIntoA2DArrayWithConditions {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.June
     * @CreateTime: 2023/6/21
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public List<List<Integer>> findMatrix(int[] nums) {
            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            List<List<Integer>> res = new ArrayList<List<Integer>>();

            for(Integer i: nums){
                map.put(i, map.getOrDefault(i, 0) + 1);
            }

            while(map.size() != 0){

                Iterator<Map.Entry<Integer,Integer>> it = map.entrySet().iterator();
                List<Integer> l = new ArrayList<Integer>();
                while(it.hasNext()){
                    Map.Entry<Integer, Integer> entry = it.next();
                    int k = entry.getKey(), v = entry.getValue();
                    if(v != 0){
                        l.add(k);
                        v -= 1;
                        map.put(k, v);
                        if(v == 0){
                            it.remove();
                        }
                    }

                }
                res.add(l);
            }

            return res;

        }
    }
}

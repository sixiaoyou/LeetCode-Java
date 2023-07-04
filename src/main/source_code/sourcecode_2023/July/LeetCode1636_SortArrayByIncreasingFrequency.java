package sourcecode_2023.July;

import java.util.*;

public class LeetCode1636_SortArrayByIncreasingFrequency {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.July
     * @CreateTime: 2023/7/4
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class SolutionV1 {
        public int[] frequencySort(int[] nums) {
            Map<Integer,Integer> map = new HashMap<Integer, Integer>();

            for(int i: nums){
                map.put(i, map.getOrDefault(i, 1)+1);
            }

            Comparator<Map.Entry<Integer, Integer>> comByValue = Comparator.comparingInt(Map.Entry<Integer, Integer> :: getValue);
            Comparator<Map.Entry<Integer, Integer>> comByKey = Comparator.comparingInt(Map.Entry<Integer, Integer> :: getKey);

            List<Integer> l = new ArrayList<Integer>();
            PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(comByKey.thenComparing(comByValue));

            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                pq.offer(entry);
            }

            while(pq.size() != 0){
                Map.Entry<Integer, Integer> kv = pq.poll();
                int k = kv.getKey(), v = kv.getValue() - 1;
                for(int m = 0; m < v ; m++){
                    l.add(k);
                }
            }

            int[] res = new int[l.size()];
            for(int j = 0; j < res.length; j++){
                res[j] = l.get(j);
            }

            return res;
        }
    }

    class SolutionV2 {
        public int[] frequencySort(int[] nums) {
            int outputindex = 0;
            int[] map = new int[201];
            int[] output = new int[nums.length];

            for(int i : nums) map[i + 100]++;

            for(int i = 1; i <= 100; i++){
                for(int j = 200; j >= 0; j--){
                    if(map[j] == i){
                        for(int count = 0; count < i; count++){

                            output[outputindex] = j - 100;
                            outputindex++;

                            if(outputindex >= nums.length) return output;
                        }
                    }
                }


            }
            return output;
        }
    }

}

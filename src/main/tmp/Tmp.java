import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tmp {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: PACKAGE_NAME
     * @CreateTime: 2023/2/20 9:01
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    public int[] separateDigits(int[] nums) {
        List<Integer> ml = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> sl = new ArrayList<Integer>();
            while (nums[i] != 0) {
                sl.add(nums[i] % 10);
                nums[i] /= 10;
            }

            for (int j = sl.size() - 1; j >= 0; j--) {
                ml.add(sl.get(j));
            }
        }

        int[] res = new int[ml.size()];
        res = Arrays.stream(ml.stream().toArray(Integer[]::new)).mapToInt(Integer::intValue).toArray();
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 2, 4}, {3, 3, 1}};


        for (int[] i : grid) {

            Arrays.sort(i);
            System.out.println(Arrays.toString(i));
            System.out.println(Arrays.toString(grid[1]));
        }


    }
}
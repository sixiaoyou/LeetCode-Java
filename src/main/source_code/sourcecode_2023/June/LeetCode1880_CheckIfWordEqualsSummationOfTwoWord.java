package sourcecode_2023.June;

public class LeetCode1880_CheckIfWordEqualsSummationOfTwoWord {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.June
     * @CreateTime: 2023/6/8
     * @Author: Sixiaoyou
     * @Version: 1.0
     */
    class Solution {
        public int convert(String str){
            int s = 0, l = str.length() - 1;
            for(char c: str.toCharArray()){
                int a = (int) Math.pow(10, l);
                s += (c - 'a') * a;
                l -= 1;
            }
            return s;
        }


        public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
            return convert(firstWord) + convert(secondWord) == convert(targetWord);

        }
    }
}

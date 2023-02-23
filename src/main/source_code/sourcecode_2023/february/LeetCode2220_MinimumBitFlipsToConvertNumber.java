package sourcecode_2023.february;

public class LeetCode2220_MinimumBitFlipsToConvertNumber {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: sourcecode_2023.february
     * @CreateTime: 2023/2/23
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    public String transfer_str(String h, int i) {
        for (int j = 0; j < i; j++) {
            h = '0' + h;
        }
        return h;
    }


    public int minBitFlipsV1(int start, int goal) {
        String a = Integer.toBinaryString(start), b = Integer.toBinaryString(goal);

        int c = a.length(), d = b.length();
        int e = Math.max(c, d), f = Math.abs(c - d);
        a = c < d ? transfer_str(a, f) : a;
        b = d < c ? transfer_str(b, f) : b;


        int count = 0;
        for (int g = 0; g < e; g++) {
            if (a.charAt(g) != b.charAt(g)) {
                count += 1;
            }
        }

        return count;
    }

    public int minBitFlipsV2(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}

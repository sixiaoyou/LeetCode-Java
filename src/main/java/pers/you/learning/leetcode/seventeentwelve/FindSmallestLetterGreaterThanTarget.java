package pers.you.learning.leetcode.seventeentwelve;

public class FindSmallestLetterGreaterThanTarget {
    
//    【网友实现】https://discuss.leetcode.com/topic/113450/easy-binary-search-in-java-o-log-n-time
    public char nextGreatestLetterV1(char[] letters, char target) {
        int n = letters.length;

        if (target >= letters[n - 1])
            target = letters[0];
        else
            target++;

        int lo = 0, hi = n - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (letters[mid] == target)
                return letters[mid];
            if (letters[mid] < target)
                lo = mid + 1;
            else
                hi = mid;
        }
        return letters[hi];
    }

    public char nextGreatestLetterV2(char[] letters, char target) {
        Character temp = null;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                temp = letters[i];
                break;

            } else if (i == letters.length - 1) {
                return letters[0];
            }
        }
        return temp;
    }
}

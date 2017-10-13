package pers.you.learning.leetcode.seventeenten;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
'''
LeetCode692. Top K Frequent Words
Given a non-empty list of words, return the k most frequent elements.

Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.

Example 1:
Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
Output: ["i", "love"]
Explanation: "i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical order.
Example 2:
Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
Output: ["the", "is", "sunny", "day"]
Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
    with the number of occurrence being 4, 3, 2 and 1 respectively.
Note:
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Input words contain only lowercase letters.
Follow up:
Try to solve it in O(n log k) time and O(n) extra space.
Can you solve it in O(n) time with only O(k) extra space?
'''
 */

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<String>();
        Map<String, Integer> treeMap = new HashMap<String, Integer>();
        for (String s : words) {
            treeMap.put(s, treeMap.getOrDefault(s, 0) + 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(treeMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        String[] sortedWords = new String[list.size()];
        int i = 0;
        for (Map.Entry<String, Integer> map : list) {
            sortedWords[i] = map.getKey();
            i += 1;
        }
        int start = 0, end = 0;
        while (start < sortedWords.length) {
            while (end < sortedWords.length && treeMap.get(sortedWords[start]) == treeMap.get(sortedWords[end])) {
                end += 1;
            }
            Arrays.sort(sortedWords, start, end);
            start = end;
        }

        for (int j = 0; j < k; j++) {
            res.add(sortedWords[j]);
        }
        return res;
    }
}

/*
 * Submission: 1759561576
 * Problem: Shortest Distance to a Character (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 16:16:59 UTC
 * Runtime: 4 ms
 * Memory: 43.1 MB
 */

import java.util.NavigableSet;

class Solution {
    public int[] shortestToChar(String s, char c) {
        NavigableSet<Integer> ts = new TreeSet<>();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == c) ts.add(i);
        }

        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            Integer a = ts.floor(i), b = ts.ceiling(i);
            ans[i] = Math.min( i-((a != null) ? a : -10000),((b != null) ? b : 10000)-i);
        } return ans;
    }
}
/*
 * Submission: 1752570494
 * Problem: Keyboard Row (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-29 15:29:40 UTC
 * Runtime: 1 ms
 * Memory: 41.3 MB
 */

import java.util.*;

class Solution {
    private static final int[] rowMap = new int[26];
    static {
        String row1 = "qwertyuiop", row2 = "asdfghjkl", row3 = "zxcvbnm";
        for (char c : row1.toCharArray()) rowMap[c - 'a'] = 1;
        for (char c : row2.toCharArray()) rowMap[c - 'a'] = 2;
        for (char c : row3.toCharArray()) rowMap[c - 'a'] = 3;
    }

    public String[] findWords(String[] words) {
        return Arrays.stream(words)
            .filter(this::inRow)
            .toArray(String[]::new);
    }

    private boolean inRow(String word) {
        int row = rowMap[Character.toLowerCase(word.charAt(0)) - 'a'];
        for (int i = 1; i < word.length(); i++) {
            if (rowMap[Character.toLowerCase(word.charAt(i)) - 'a'] != row)
                return false;
        }
        return true;
    }
}

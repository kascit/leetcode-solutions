/*
 * Submission: 1731073205
 * Problem: Maximum Value of a String in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 10:05:52 UTC
 * Runtime: 1 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs) {
            max = Math.max(max, solve(s));
        }
        return max;
    }

    private int solve(String s) {
        boolean hasLetter = false;

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }

        if (hasLetter)

        {
            return s.length();
        }
        return Integer.parseInt(s);

    }
}
/*
 * Submission: 1752592135
 * Problem: Check if Numbers Are Ascending in a Sentence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-29 15:51:27 UTC
 * Runtime: 4 ms
 * Memory: 42 MB
 */

class Solution {
    public boolean areNumbersAscending(String s) {
        String[] parts = s.split("\\D+");
        int prev = 0;
        for (String num : parts) {
            if (num.equals("")) continue;
            int cur = Integer.parseInt(num);
            if (cur <= prev) return false;
            prev = cur;
        } return true;
    }
}
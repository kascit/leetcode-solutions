/*
 * Submission: 1752593966
 * Problem: Check if Numbers Are Ascending in a Sentence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-29 15:53:09 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

class Solution {
    public boolean areNumbersAscending(String s) {
        String[] parts = s.split(" ");
        int prev = -1;
        for (String token : parts) {
            if (Character.isDigit(token.charAt(0))) {
                int num = Integer.parseInt(token);
                if (num <= prev) {
                    return false;
                }
                prev = num;
            }
        } return true;
    }
}
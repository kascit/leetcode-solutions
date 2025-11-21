/*
 * Submission: 1730241301
 * Problem: Count Asterisks (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:04:41 UTC
 * Runtime: 0 ms
 * Memory: 41.9 MB
 */

class Solution {
    static {
        for(int i = 0; i < 500; i++)
            countAsterisks("");
    }
    public static int countAsterisks(String s) {
        boolean consider = true;
        int count = 0;
        for (char ch : s.toCharArray()){
            if (consider && ch == '*') count++;
            if (ch == '|') consider = !consider;
        } return count;
    }
}
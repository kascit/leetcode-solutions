/*
 * Submission: 1730240585
 * Problem: Count Asterisks (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:03:54 UTC
 * Runtime: 1 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int countAsterisks(String s) {
        boolean consider = true;
        int count = 0;
        for (char ch : s.toCharArray()){
            if (consider && ch == '*') count++;
            if (ch == '|') consider = !consider;
        } return count;
    }
}
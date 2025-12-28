/*
 * Submission: 1835965509
 * Problem: Number of Valid Clock Times (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 12:01:55 UTC
 * Runtime: 0 ms
 * Memory: 42.7 MB
 */

class Solution {
    public int countTime(String time) {
        int h1 = time.charAt(0), h2 = time.charAt(1);
        int m1 = time.charAt(3), m2 = time.charAt(4);

        int hours = 1, minutes = 1;

        if (h1 == '?' && h2 == '?') hours = 24;
        else if (h1 == '?') hours = (h2 <= '3') ? 3 : 2;
        else if (h2 == '?') hours = (h1 == '2') ? 4 : 10;

        if (m1 == '?' && m2 == '?') minutes = 60;
        else if (m1 == '?') minutes = 6;
        else if (m2 == '?') minutes = 10;

        return hours * minutes;
    }
}

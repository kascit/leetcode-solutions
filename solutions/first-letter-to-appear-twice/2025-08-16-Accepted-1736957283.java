/*
 * Submission: 1736957283
 * Problem: First Letter to Appear Twice (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 07:13:36 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public char repeatedCharacter(String s) {
        int m = 0;
        char [] ar = s.toCharArray();
        for (char ch : ar){
            int flag = 1<<ch-'a';
            if ((m & flag) == flag) return ch;
            m |= (flag);
        } return '-';
    }
}
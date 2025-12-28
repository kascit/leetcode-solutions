/*
 * Submission: 1747603532
 * Problem: Check if Word Equals Summation of Two Words (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 10:23:41 UTC
 * Runtime: 0 ms
 * Memory: 41.7 MB
 */

class Solution {
    public boolean isSumEqual(String f, String s, String t) {
        return d(f)+d(s) == d(t);
    }
    private int d(String s) {
        int len = s.length(), num = 0;
        for (int i = 0; i < len; i++) {
            num += s.charAt(i)-'a';
            num*=10;
        } return num;
    }
}
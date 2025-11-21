/*
 * Submission: 1735110240
 * Problem: Reverse String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 15:55:32 UTC
 * Runtime: 0 ms
 * Memory: 49.3 MB
 */

class Solution {
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length -1; i < j; i++,j--){
            s[i] = (char)(s[i] + s[j] - (char)(s[j] = s[i]));
        } return;
    }
}
/*
 * Submission: 1750482594
 * Problem: Find Smallest Letter Greater Than Target (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-27 17:49:23 UTC
 * Runtime: 0 ms
 * Memory: 44.2 MB
 */

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, r = letters.length - 1;
        char ans = '-';
        while (l <= r) {
            int mid = l + (r-l)/2;
            char cur = letters[mid];
            if (cur <= target) {
                l = mid + 1;
            } else {
                ans = cur;
                r = mid - 1;
            }
        } return (ans != '-') ? ans : letters[0];
    }
}
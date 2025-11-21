/*
 * Submission: 1736935863
 * Problem: Minimum Number of Chairs in a Waiting Room (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 06:53:34 UTC
 * Runtime: 1 ms
 * Memory: 42.1 MB
 */

class Solution {
    public int minimumChairs(String s) {
        char[] arr = s.toCharArray();
        int c = 0, ans = 0;
        for (char ch : arr){
            if (ch == 'E') c++;
            else c--;
            ans = (ans > c) ? ans : c;
        } return ans;
    }
}
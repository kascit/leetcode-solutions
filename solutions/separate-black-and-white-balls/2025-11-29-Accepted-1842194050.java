/*
Submission: 1842194050
Status: Accepted
Timestamp: 2025-11-29 04:45:28 UTC
Runtime: 7 ms
Memory: 47.1 MB
*/

class Solution {
    public long minimumSteps(String s) {
        long swaps = 0;
        long cnt = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') cnt++;
            else swaps += cnt;
        } return swaps;
    }
}
/*
 * Submission: 1705706648
 * Problem: Minimum Number of Operations to Move All Balls to Each Box (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 08:56:32 UTC
 * Runtime: 2 ms
 * Memory: 45 MB
 */

  
class Solution {
    
    public static int[] minOperations(String boxes) {
        final int n = boxes.length();
        final byte[] b = new byte[n];
        final int[] res = new int[n];
        int sum = 0, count = 0;
        boxes.getBytes(0, n, b, 0);
        for(int i = n - 1; i >= 0; i--)
            sum += count += b[i] & 1;
        for(int i = 0; i < n; i++) {
            res[i] = sum -= count;
            count -= (b[i] & 1) << 1;
        }
        return res;
    }
}
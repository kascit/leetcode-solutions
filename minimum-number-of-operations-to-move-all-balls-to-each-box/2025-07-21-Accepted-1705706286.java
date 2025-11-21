/*
 * Submission: 1705706286
 * Problem: Minimum Number of Operations to Move All Balls to Each Box (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 08:56:11 UTC
 * Runtime: 0 ms
 * Memory: 44.6 MB
 */

  
class Solution {
    

      static {
        for (int i = 0; i < 100; i++) {
            minOperations("1011");
        }
    }
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
/*
 * Submission: 1738320013
 * Problem: Find the K-or of an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 09:06:15 UTC
 * Runtime: 1 ms
 * Memory: 43.5 MB
 */

class Solution {
    public int findKOr(int[] nums, int k) {
        int max = 0;
        byte[] freq = new byte[32];
        for (int n : nums){
            int bit = 0;
            while( n > 0 ){
                freq[bit] += (n&1);
                n>>=1;
                bit++;
            }
        }
        int bit = 0;
        for(byte f : freq){
            max += (f >= k) ? 1<<bit : 0;
            bit++;
        }
        return max;
        
    }
}
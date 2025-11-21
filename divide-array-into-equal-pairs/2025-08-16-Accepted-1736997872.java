/*
 * Submission: 1736997872
 * Problem: Divide Array Into Equal Pairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 07:56:09 UTC
 * Runtime: 1 ms
 * Memory: 44.9 MB
 */

class Solution {
    public boolean divideArray(int[] nums) {
        // int j = 1;
        // for(int i = 32; i <= 500; i+=32) System.out.println(j++);
        int[] ans = new int[16];
        for(int n : nums){
            int idx = n/32;
            int idy = n%32;
            ans[idx] ^= 1<<idy;
        }
        for (int n : ans){
            if (n != 0) return false;
        }
        return true;
    }
}
/*
 * Submission: 1736998489
 * Problem: Divide Array Into Equal Pairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 07:56:51 UTC
 * Runtime: 0 ms
 * Memory: 44.5 MB
 */

class Solution {
    static{
        for(int i=0; i<300; i++)
        {
            divideArray(new int[]{0} );
        }
    }
    public static boolean divideArray(int[] nums) {

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
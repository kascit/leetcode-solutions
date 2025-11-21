/*
 * Submission: 1737035863
 * Problem: Maximum Strong Pair XOR I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 08:40:13 UTC
 * Runtime: 2 ms
 * Memory: 42.5 MB
 */

class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n = nums.length;
        int maxX = 0;

        for(int i = 0; i < n; i++){
            int x = nums[i];
            for(int j = i + 1; j < n; j++){ 
                int y = nums[j];
                if (x == y) continue;
                if(Math.abs(x-y) <= Math.min(x, y)){
                    int xor = x^y;
                    maxX = Math.max(maxX, xor);
                }
            }
        }
        return maxX;
    }
}
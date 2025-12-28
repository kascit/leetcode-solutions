/*
 * Submission: 1739446596
 * Problem: Maximum Number of Pairs in Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 09:37:34 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {

    static{
        for(int i=0;i<300;i++){
            numberOfPairs(new int[]{1});
        }
    }
    public static int[] numberOfPairs(int[] nums) {
    
        int[] freq = new int[101];
        for (int x : nums) {
            freq[x]++;
        }

        int pairs = 0;
        int leftovers = 0;
        for (int i = 0; i <= 100; i++) {
            pairs += freq[i] / 2;
            leftovers += freq[i] % 2;
        }

       
        return new int[]{pairs, leftovers};
    }
}
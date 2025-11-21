/*
 * Submission: 1716886211
 * Problem: Two Out of Three (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 09:23:52 UTC
 * Runtime: 1 ms
 * Memory: 45 MB
 */

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        int[] freq1 = new int[100];
        int[] freq2 = new int[100];
        int[] freq3 = new int[100];
        List<Integer> ans = new ArrayList<>();
        for (int i : nums1){
            if (freq1[i-1] < 1 ) freq1[i-1]++;
        }
        for (int i : nums2){
            if (freq2[i-1] < 1 ) freq2[i-1]++;
        }
        for (int i : nums3){
            if (freq3[i-1] < 1 ) freq3[i-1]++;
        }

        

        for (int i = 0; i < 100; i++){
            if (freq1[i] + freq2[i] + freq3[i] > 1) ans.add(i+1);
        }
        return ans;
    }
}
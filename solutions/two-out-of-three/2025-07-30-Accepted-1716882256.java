/*
 * Submission: 1716882256
 * Problem: Two Out of Three (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 09:20:12 UTC
 * Runtime: 5 ms
 * Memory: 45.6 MB
 */

class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        int[] freq = new int[100];
        List<Integer> ans = new ArrayList<>();
        for (int i : nums1){
            set1.add(i);
        }
        for (int i : nums2){
            set2.add(i);
        }
        for (int i : nums3){
            set3.add(i);
        }

        for (int i = 1; i <= 100; i++){
            if (set1.contains(i)) freq[i-1]++;
            if (set2.contains(i)) freq[i-1]++;
            if (set3.contains(i)) freq[i-1]++;
        }

        for (int i = 0; i < 100; i++){
            if (freq[i] > 1) ans.add(i+1);
        }
        return ans;
    }
}
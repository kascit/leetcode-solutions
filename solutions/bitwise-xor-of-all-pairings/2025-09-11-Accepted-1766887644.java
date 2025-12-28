/*
 * Submission: 1766887644
 * Problem: Bitwise XOR of All Pairings (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-11 07:11:03 UTC
 * Runtime: 1 ms
 * Memory: 61.1 MB
 */

class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        // int max = 0;
        // for (int n : nums1) if(n > max) max = n;
        // for (int n : nums2) if(n > max) max = n;
        // int freq[] = new int[max+1];
        int len1 = nums1.length;
        int len2 = nums2.length;
        int ans = 0;
        boolean len2Even = len1%2 == 0;
        boolean len1Even = len2%2 == 0;
        if (len2Even && len1Even) return 0;
        int f = 0;
            for (int n : nums2) ans ^= n;
            // return ans;
            for (int n : nums1) f ^= n;
            // f^=ans;
            // return ans;
        if (len1Even) {
            return ans;
        }
        if (len2Even) {
            return f;
        } return ans^f;



        // if (len2Even) {
        //     for (int n : nums2) freq[n]++;
        // }
        // for (int n : nums1) freq[n]+=(len2);
        // for (int n : nums2) freq[n]++;

    }
}
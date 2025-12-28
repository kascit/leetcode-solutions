/*
 * Submission: 1739326998
 * Problem: Intersection of Two Arrays (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 07:05:49 UTC
 * Runtime: 2 ms
 * Memory: 43.5 MB
 */

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int min = (nums1.length > nums2.length) ? nums2.length : nums1.length;
        Set<Integer> a = new HashSet<>(min);
        Set<Integer> b = new HashSet<>(min);
        for(int i : nums1){     
            a.add(i);
        }
        for(int i : nums2){   
            if (a.contains(i)) {
                b.add(i);
            }
        }
        int[] ans = new int[b.size()];
        int idx = 0;
        for (int i : b){
            ans[idx++] = i;
        }
        return ans;
    }
}
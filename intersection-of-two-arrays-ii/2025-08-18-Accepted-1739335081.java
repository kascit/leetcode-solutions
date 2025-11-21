/*
 * Submission: 1739335081
 * Problem: Intersection of Two Arrays II (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 07:15:37 UTC
 * Runtime: 3 ms
 * Memory: 43.2 MB
 */

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int lena = nums1.length;
        int lenb = nums2.length;
        int min = Math.min(lena,lenb);
        int[] ans = new int[min];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l = 0, r = 0, idx = 0;
        // System.out.println(Arrays.toString(nums1));
        // System.out.println(Arrays.toString(nums2));
        while(l < lena && r < lenb){
            // System.out.println(l +"   " + r) ;
            if (nums1[l] == nums2[r]){
                ans[idx++] = nums1[l];
                l++;
                r++;
            }
            else if (nums1[l] < nums2[r]) l++;
            else r++;
        }
        return Arrays.copyOf(ans,idx);
    }
}
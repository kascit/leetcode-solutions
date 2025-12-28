/*
 * Submission: 1705763214
 * Problem: Next Greater Element I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 09:51:43 UTC
 * Runtime: 0 ms
 * Memory: 43.9 MB
 */

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ind=new int[10000];
        for(int i=0; i<nums2.length; i++){
            ind[nums2[i]]=i;
        }

        for(int j=0; j<nums1.length; j++){
            nums1[j]=nextGreat(nums2, ind[nums1[j]]);
        }
        return nums1;
    }

    public static int nextGreat(int[] n2, int index){
        for(int i=index+1; i<n2.length; i++){
            if(n2[index]<n2[i]) return n2[i];
        }
        return -1;
    }
}
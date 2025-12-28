/*
 * Submission: 1731406174
 * Problem: Merge Similar Items (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 15:45:17 UTC
 * Runtime: 8 ms
 * Memory: 45.6 MB
 */

class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] nums1, int[][] nums2) {
        Arrays.sort(nums1,(a,b)->a[0]-b[0]);
        Arrays.sort(nums2,(a,b)->a[0]-b[0]);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        int i = 0;
        int j = 0;

        while(i<n && j<m){
            if(nums1[i][0] == nums2[j][0]){
                ans.add(List.of(nums1[i][0], nums1[i][1] + nums2[j][1]));
                i++;
                j++;
            }else if(nums1[i][0] > nums2[j][0]){
                ans.add(List.of(nums2[j][0],nums2[j][1]));
                j++;
            }else{
                ans.add(List.of(nums1[i][0],nums1[i][1]));
                i++;
            }
        }

        while(i<n){
            ans.add(List.of(nums1[i][0],nums1[i][1]));
            i++;
        }

        while(j<m){
            ans.add(List.of(nums2[j][0],nums2[j][1]));
            j++;
        }
        return ans;
    }
}
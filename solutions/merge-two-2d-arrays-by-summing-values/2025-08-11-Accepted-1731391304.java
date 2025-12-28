/*
 * Submission: 1731391304
 * Problem: Merge Two 2D Arrays by Summing Values (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 15:32:40 UTC
 * Runtime: 5 ms
 * Memory: 45.4 MB
 */

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Set<Integer> s = new HashSet<>();
        for (int[] i : nums1){
            s.add(i[0]);
        }
        for (int[] i : nums2){
            s.add(i[0]);
        }
        int len = s.size();
        int[][] ans = new int[len][2];
        int i = 0;
        for(int it : s){
            ans[i++][0] = it;
        }
        int j = 0, k = 0;
        i = 0;
        Arrays.sort(ans,(a,b) -> a[0] - b[0]);
        //System.out.println(Arrays.deepToString(ans));// return null;
        while(i<nums1.length || j<nums2.length){
            if(i<nums1.length && nums1[i][0] == ans[k][0]) ans[k][1] += nums1[i++][1];
            if(j<nums2.length && nums2[j][0] == ans[k][0]) ans[k][1] += nums2[j++][1];
            k++;
        } return ans;

    }
}
/*
 * Submission: 1747451762
 * Problem: Positions of Large Groups (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 07:23:10 UTC
 * Runtime: 1 ms
 * Memory: 44.6 MB
 */

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int len = s.length();
        int l = 0, r = 0;
        while (l < len - 2) {
            char cur = s.charAt(l);
            while(r < len && s.charAt(r) == cur) r++;
            // System.out.println(l+"   "+r);
            if (r - l >= 3) {
                ans.add(List.of(l,r-1));
            }
            l = r;
            // l++;
        } return ans;
    }
}
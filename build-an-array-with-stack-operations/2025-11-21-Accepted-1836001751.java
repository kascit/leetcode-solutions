/*
 * Submission: 1836001751
 * Problem: Build an Array With Stack Operations (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-21 13:07:23 UTC
 * Runtime: 0 ms
 * Memory: 44.4 MB
 */

class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int cur = 1, idx = 0;
        while (idx < target.length) {
            ans.add("Push");
            if (target[idx] != cur) {
                if (cur < target[idx]) {
                    cur++;
                } else idx++;
                ans.add("Pop");
            } else {
                idx++;
                cur++;
            }
        } return ans;
    }
}
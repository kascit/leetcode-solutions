/*
Submission: 1837033204
Status: Accepted
Timestamp: 2025-11-22 18:12:50 UTC
Runtime: 5 ms
Memory: 62.8 MB
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        // Set<Integer> s = new HashSet<>();
        int max = -1;
        for (int n : nums) {
            max = (max < n) ? n : max;
        }
        int[] s = new int[max+1];
        for (int n : nums) {
            if (s[n] == 1) ans.add(n);
            s[n] = 1;
        } return ans;
    }
}
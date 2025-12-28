/*
Submission: 1837032226
Status: Accepted
Timestamp: 2025-11-22 18:11:32 UTC
Runtime: 18 ms
Memory: 70.5 MB
*/

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for (int n : nums) {
            if (!s.add(n)) ans.add(n);
        } return ans;
    }
}
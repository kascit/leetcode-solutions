/*
Submission: 1837898917
Status: Accepted
Timestamp: 2025-11-23 18:25:30 UTC
Runtime: 3 ms
Memory: 45.8 MB
*/

class Solution {
    int[] ca;
    int t;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ca = candidates;
        t = target;
        List<List<Integer>> ans = new ArrayList<>();
        bt(ans, new ArrayList<>(), 0, 0);
        return ans;
    }

    void bt(List<List<Integer>> ans, List<Integer> cur, int run, int start) {
        if (run > t) return;
        if (run == t) {
            ans.add(new ArrayList<>(cur));
            return;
        }

        for (int i = start; i < ca.length; i++) {
            int c = ca[i];
            cur.add(c);
            bt(ans, cur, run + c, i);
            cur.remove(cur.size() - 1);
        }
    }
}

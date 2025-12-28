/*
Submission: 1836115287
Status: Accepted
Timestamp: 2025-11-21 16:07:24 UTC
Runtime: 1 ms
Memory: 44.3 MB
*/

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        bt(0,ans,new ArrayList<>(),nums.length,nums);
        return ans;
    }

    void bt(int i, List<List<Integer>> ans, List<Integer> cur, int n, int[] nums) {
        if (i == n) {
            ans.add(new ArrayList<>(cur));
            return;
        }
        cur.add(nums[i]);
        bt(i+1,ans,cur,n,nums);
        cur.remove(cur.size()-1);
        bt(i+1,ans,cur,n,nums);

    }
}
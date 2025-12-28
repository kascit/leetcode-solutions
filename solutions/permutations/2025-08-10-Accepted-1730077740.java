/*
 * Submission: 1730077740
 * Problem: Permutations (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 12:13:37 UTC
 * Runtime: 1 ms
 * Memory: 44.3 MB
 */

class Solution {
    private List<List<Integer>> ans = new ArrayList();
    private boolean taken[];
    public List<List<Integer>> permute(int[] nums) {
        taken = new boolean[nums.length];
        bt(nums,new ArrayList());
        return ans;
    }

    private void swap(int[] nums, int l,int  r){
        nums[l] = nums[r] + nums[l] - (nums[r] = nums[l]);
        return;
    }

    private void bt(int[] nums, List<Integer> cur){
        if (cur.size() == nums.length){
            ans.add(new ArrayList(cur));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if (taken[i]) continue;
            taken[i] = true;
            cur.add(nums[i]);
            bt(nums,cur);
            taken[i] = false;
            cur.remove(cur.size()-1);
        } return;
    }


}
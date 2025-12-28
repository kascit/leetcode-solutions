/*
 * Submission: 1730069514
 * Problem: Permutations II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 12:04:13 UTC
 * Runtime: 2 ms
 * Memory: 44.8 MB
 */

class Solution {
    private List<List<Integer>> ans = new ArrayList();
    private int len;
    private boolean[] taken;
    public List<List<Integer>> permuteUnique(int[] nums) {
        len = nums.length;
        taken = new boolean[len];
        Arrays.sort(nums);
        bt(nums,0,new ArrayList());
        return ans;
    } 
    private void bt(int[] arr, int idx, List<Integer> cur){
        if (cur.size() == len){
            ans.add(new ArrayList(cur));
            return;
        }

        for (int i = 0; i < len; i++){
            if (taken[i]) continue;
            if(i>0 &&arr[i-1]==arr[i] && !taken[i-1]) continue;
            cur.add(arr[i]);
            taken[i]=true;
            bt(arr,i+1,cur);
            taken[i] = false;
            cur.remove(cur.size()-1);
        }
        return;
    }
}
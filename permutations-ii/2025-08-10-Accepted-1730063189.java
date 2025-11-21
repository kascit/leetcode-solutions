/*
 * Submission: 1730063189
 * Problem: Permutations II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 11:56:53 UTC
 * Runtime: 3 ms
 * Memory: 45.3 MB
 */

class Solution {
    private List<List<Integer>> ans = new ArrayList();
    private int len;
    private Set<Integer> taken = new HashSet();
    public List<List<Integer>> permuteUnique(int[] nums) {
        len = nums.length;
        Arrays.sort(nums);
        bt(nums,0,new ArrayList());
        return ans;
    } 
    private void bt(int[] arr, int idx, List<Integer> cur){
        if (cur.size() == len){
            ans.add(new ArrayList(cur));
            return;
        }

        int lastRemoved = 99;
        for (int i = 0; i < len; i++){
            if (taken.contains(i) || arr[i] == lastRemoved) continue;
            cur.add(arr[i]);
            taken.add(i);
            bt(arr,i+1,cur);
            taken.remove(i);
            lastRemoved = cur.remove(cur.size()-1);
        }
        return;
    }
}
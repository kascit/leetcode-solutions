/*
 * Submission: 1608170788
 * Problem: Combination Sum III (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-16 04:36:34 UTC
 * Runtime: 0 ms
 * Memory: 41.2 MB
 */

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        bt(1,k,n,new ArrayList<>(),res);
        return res;
    }
    void bt(int it,int k, int target, List<Integer> cur, List<List<Integer>> res){
        if (k == 0 && target == 0) res.add(new ArrayList<>(cur));
        for(int i = it; i <= 9; i++){
            if(i>target) break;
            cur.add(i);
            bt(i+1,k-1,target-i,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}
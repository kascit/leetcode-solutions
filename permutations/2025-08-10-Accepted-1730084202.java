/*
 * Submission: 1730084202
 * Problem: Permutations (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 12:21:10 UTC
 * Runtime: 4 ms
 * Memory: 44.8 MB
 */

class Solution {
    private List<List<Integer>> ans = new ArrayList();
    public List<List<Integer>> permute(int[] nums) {
        bt(nums,0);
        return ans;
    }

    private void swap(int[] nums, int l,int  r){
        nums[l] = nums[r] + nums[l] - (nums[r] = nums[l]);
        return;
    }

    private void bt(int[] nums, int id){
        if (id == nums.length){
            ans.add(Arrays.stream(nums) 
              .boxed()    
              .toList()); 
            return;
        }

        for(int i = id; i < nums.length; i++){
            swap(nums,i,id);
            bt(nums,id+1);
            swap(nums,i,id);
        } return;
    }


}
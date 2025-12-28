/*
 * Submission: 1739320934
 * Problem: Intersection of Multiple Arrays (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-18 06:58:45 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public List<Integer> intersection(int[][] nums) {
        Set<Integer> a = new HashSet<>(nums[0].length);
        Set<Integer> b = new HashSet<>(nums[0].length);
        int flag = 0;
        for(int i : nums[0]){
            b.add(i);
        }
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[i].length; j++){
                int cur = nums[i][j];
                if (b.contains(cur) && flag%2 == 0) a.add(cur);
                else if (a.contains(cur)) b.add(cur);
            }
            if (flag%2 == 0){
                b.clear();
            } else a.clear();
            flag++;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i : b){
            ans.add(i);
        }
        for(int i : a){
            ans.add(i);
        } 
        return ans;


    }
}
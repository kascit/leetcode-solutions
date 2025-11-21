/*
 * Submission: 1684700864
 * Problem: Summary Ranges (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-03 06:43:50 UTC
 * Runtime: 5 ms
 * Memory: 41.8 MB
 */

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int start = 0, end = 0;
        boolean canDo = true;
        for(int i = 0; i < nums.length; i++){
            if(canDo) start = nums[i];
            //System.out.println();
            end = Integer.MIN_VALUE;
            if(i < nums.length - 1 && nums[i+1] - 1 == nums[i]){
                canDo = false;
                continue;   
            } else{
                end = nums[i];
                canDo = true;
            }
            if (start == end){ ans.add(Integer.toString(start));}
            else {ans.add(new String(start +"->" + end));}
        }
        return ans;
    }
}
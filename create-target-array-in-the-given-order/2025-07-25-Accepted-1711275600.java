/*
 * Submission: 1711275600
 * Problem: Create Target Array in the Given Order (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 17:06:29 UTC
 * Runtime: 2 ms
 * Memory: 42.3 MB
 */

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] ans = new int[len];
        Arrays.fill(ans,-1);
        //System.out.println(Arrays.toString(ans));
        for (int i = 0; i < len; i++){
            //System.out.println(ans[index[i]]+" "+Arrays.toString(ans));
            int cur = ans[index[i]];
            if ( cur != -1){
                for (int j = index[i]; j < len - 1; j++){
                    int next = ans[j+1];
                    ans[j+1] = cur;
                    cur = next;
                }
            }
            ans[index[i]] = nums[i];
            //System.out.println(Arrays.toString(ans));
        }return ans;
    }
}
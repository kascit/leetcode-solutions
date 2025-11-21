/*
 * Submission: 1737017732
 * Problem: Distribute Elements Into Two Arrays I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-16 08:19:06 UTC
 * Runtime: 1 ms
 * Memory: 44.5 MB
 */

class Solution {
    public int[] resultArray(int[] nums) {
        int l = 0, r = 1, len = nums.length, cur = 2;
        while (cur < len){
            int TEMP = nums[cur];
            // System.out.println(TEMP +" l: "+ nums[l] +" r:  "+ nums[r]);
            if (nums[l] < nums[r]){
                // System.out.println("l<r");
                r++;
                nums[cur] = nums[r];
                nums[r] = TEMP;
            } else {
                // System.out.println("l>r");
                l++;
                int shift = cur;
                while ( shift > l){
                    nums[shift] = nums[shift-1];
                    shift--;
                }
                r++;
                nums[l] = TEMP;
            }
            cur++;
            // System.out.println(Arrays.toString(nums));
            // System.out.println();
        } return nums;
    }
}
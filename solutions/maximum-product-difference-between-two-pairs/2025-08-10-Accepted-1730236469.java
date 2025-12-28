/*
 * Submission: 1730236469
 * Problem: Maximum Product Difference Between Two Pairs (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 14:59:39 UTC
 * Runtime: 3 ms
 * Memory: 45.1 MB
 */

class Solution {
    public int maxProductDifference(int[] nums) {
        int  maxy = 1, miny = 1;
        for(int i = 0; i < 2; i++){
            int max = 0, min = 0, jt = 0;
            while(nums[max] == -1 || nums[min] == -1){
                max = (min = jt);
                jt++;
            }
            for (int j = 0; j < nums.length; j++){
                if (nums[j] == -1) continue;
                if (nums[j] > nums[max]) max = j;
                if (nums[j] < nums[min]) min = j;
            }
            maxy *= nums[max];
            miny *= nums[min];
            nums[max] = -1;
            nums[min] = -1;
            // System.out.println(maxy +""+miny);
        } return maxy - miny;
    }
}
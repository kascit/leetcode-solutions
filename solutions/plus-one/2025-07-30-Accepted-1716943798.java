/*
 * Submission: 1716943798
 * Problem: Plus One (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-30 10:18:42 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int[] plusOne(int[] digits) {
        boolean increase = true;
        for (int i : digits){
            if (i != 9) {
                increase = false;
                break;
            }
        }
        if (increase){
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            return ans;
        }
        increase = true;
        for (int i = digits.length - 1;  i >= 0; i--){
            if (!increase) break;
            increase = false;
            if (digits[i] == 9){
                digits[i] = 0;
                increase = true;
            } else {
                digits[i] += 1;
            }
            
        }
        return digits;
    }
}
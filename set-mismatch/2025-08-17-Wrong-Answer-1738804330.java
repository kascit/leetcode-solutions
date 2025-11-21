/*
 * Submission: 1738804330
 * Problem: Set Mismatch (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-17 17:31:55 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length, realX = 0, expcX = 0, it = 1, sum = 0;
        for (int n : nums){
            realX ^= n;
            expcX ^= it++;
            sum += n;
        }

        int miss = realX ^ expcX;

        int diff = (len*(len+1))/2 - sum;
        if (diff < 0) diff *= -1;
        for (int i = 1; i <= len - diff; i++){
            if (((i ^ (i+diff)) == miss)) return new int[]{i,i+diff};
        }
        return null;
    }
}


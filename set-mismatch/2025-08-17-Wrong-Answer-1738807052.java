/*
 * Submission: 1738807052
 * Problem: Set Mismatch (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-17 17:34:14 UTC
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
        boolean opp = false;
        if (diff < 0) {diff *= -1; opp = true;}
        for (int i = 1; i <= len - diff; i++){
            if (((i ^ (i+diff)) == miss)) {
                if (!opp) return new int[]{i,i+diff};
                else return new int[]{i+diff,i};
            }
        }
        return null;
    }
}


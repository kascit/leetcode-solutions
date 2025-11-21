/*
 * Submission: 1738822698
 * Problem: Average Value of Even Numbers That Are Divisible by Three (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 17:47:37 UTC
 * Runtime: 0 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int averageValue(int[] nums) {
        int count = 0, sum = 0;
        for (int n : nums){
            if ( n%6 == 0){
                sum += n;
                count++;
            }
        } return (count != 0) ? sum/count : 0;
    }
}
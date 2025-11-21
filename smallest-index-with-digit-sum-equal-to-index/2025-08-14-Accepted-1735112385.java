/*
 * Submission: 1735112385
 * Problem: Smallest Index With Digit Sum Equal to Index (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 15:57:41 UTC
 * Runtime: 1 ms
 * Memory: 44 MB
 */

class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            if (i == digits(nums[i])) return i;
        } return -1;

    }
    private int digits(int n){
        int sum = 0;
        while (n > 0){
            sum += n%10;
            n/=10;
        } return sum;
    }
}
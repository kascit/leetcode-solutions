/*
 * Submission: 1736208012
 * Problem: Distribute Candies to People (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 14:21:47 UTC
 * Runtime: 2 ms
 * Memory: 41.5 MB
 */

class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int cur = 1;
        for(int i = 0; candies>0; i=(i+1)%num_people){
            if (candies < cur) cur = candies;
            ans[i] += cur;
            candies-=cur;
            cur++;
        } return ans;
    }
}
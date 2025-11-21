/*
 * Submission: 1758108197
 * Problem: Apple Redistribution into Boxes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 10:50:49 UTC
 * Runtime: 1 ms
 * Memory: 42.3 MB
 */

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for (int a : apple) sum += a;
        // System.out.println(sum);
        Arrays.sort(capacity);
        int r = capacity.length - 1;
        while(r>=0 && sum > 0){
            sum-=capacity[r--];
        } return capacity.length - r - 1;
    }
}
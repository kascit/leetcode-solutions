/*
 * Submission: 1758106713
 * Problem: Apple Redistribution into Boxes (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 10:48:53 UTC
 * Runtime: 3 ms
 * Memory: 42.9 MB
 */

class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = Arrays.stream(apple).sum();
        // System.out.println(sum);
        Arrays.sort(capacity);
        int r = capacity.length - 1;
        while(r>=0 && sum > 0){
            sum-=capacity[r--];
        } return capacity.length - r - 1;
    }
}
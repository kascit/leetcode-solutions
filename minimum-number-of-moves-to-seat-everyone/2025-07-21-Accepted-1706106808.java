/*
 * Submission: 1706106808
 * Problem: Minimum Number of Moves to Seat Everyone (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 15:22:28 UTC
 * Runtime: 3 ms
 * Memory: 44.4 MB
 */

class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int ans = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++){
            ans += Math.abs(seats[i] - students[i]);
        }
        return ans;
    }
}
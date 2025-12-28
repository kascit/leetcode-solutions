/*
 * Submission: 1724590997
 * Problem: Sum Multiples (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 16:02:12 UTC
 * Runtime: 2 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 3; i <= n; i++){
            if(i%3 == 0 || i%5 == 0 || i%7 == 0) sum += i;
        } return sum;
    }
}
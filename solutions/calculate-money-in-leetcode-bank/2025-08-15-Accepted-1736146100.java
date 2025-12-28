/*
 * Submission: 1736146100
 * Problem: Calculate Money in Leetcode Bank (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 13:27:03 UTC
 * Runtime: 0 ms
 * Memory: 40 MB
 */

class Solution {
    public int totalMoney(int n) {
        return ((n)/7)*(28 + (28+7*((n)/7-1)))/2 + (n%7)*( (1+(n/7)) + (1+(n/7) + (n%7-1)) )/2;

    }
}
/*
1       init start

1 + n/7 final start
*/
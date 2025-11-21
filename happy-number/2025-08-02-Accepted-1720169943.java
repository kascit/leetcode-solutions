/*
 * Submission: 1720169943
 * Problem: Happy Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-02 04:46:02 UTC
 * Runtime: 1 ms
 * Memory: 40.5 MB
 */

class Solution {
    Set<Integer> seen = new HashSet<>();
    public boolean isHappy(int n) {
        return check(n);
    }

    boolean check(int n){
        if (n == 1) return true;
        int sum = 0;
        while (n > 0){
            sum += (n%10)*(n%10);
            n /= 10;
        }
        if (seen.contains(sum)) return false;
        seen.add(sum);
        return check(sum);
    }
}
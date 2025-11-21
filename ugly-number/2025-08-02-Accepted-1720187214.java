/*
 * Submission: 1720187214
 * Problem: Ugly Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-02 05:06:50 UTC
 * Runtime: 0 ms
 * Memory: 40.5 MB
 */

class Solution {
    public boolean isUgly(int n) {
        if (n<1) return false;
        while (n > 1){
            boolean done = false;
            if (n%2 == 0) {n/=2; done = true;}
            if (n%3 == 0) {n/=3; done = true;}
            if (n%5 == 0) {n/=5; done = true;}
        if (!done) return false;}return true;
         
    }
}
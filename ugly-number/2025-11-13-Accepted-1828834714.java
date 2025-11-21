/*
 * Submission: 1828834714
 * Problem: Ugly Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-13 15:22:36 UTC
 * Runtime: 1 ms
 * Memory: 42.7 MB
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
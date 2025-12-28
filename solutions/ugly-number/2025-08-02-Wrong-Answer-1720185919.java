/*
 * Submission: 1720185919
 * Problem: Ugly Number (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-02 05:05:20 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isUgly(int n) {
        
        while (n > 1){
            boolean done = false;
            if (n%2 == 0) {n/=2; done = true;}
            if (n%3 == 0) {n/=3; done = true;}
            if (n%5 == 0) {n/=5; done = true;}
        if (!done) return false;}return true;
         
    }
}
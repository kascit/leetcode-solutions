/*
 * Submission: 1733931625
 * Problem: Check Balanced String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 15:58:12 UTC
 * Runtime: 1 ms
 * Memory: 42.5 MB
 */

class Solution {
    public boolean isBalanced(String num) {
        int evn = 0 , odd = 0;
        boolean even = true;
        for(char ch : num.toCharArray()){
            if (even) evn += ch - '0';
            else odd += ch -'0';
            even = !even;
        } return odd == evn;
    }
}
/*
 * Submission: 1748517640
 * Problem: Percentage of Letter in String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-26 04:31:30 UTC
 * Runtime: 0 ms
 * Memory: 41.4 MB
 */

class Solution {
    public int percentageLetter(String s, char letter) {
        int len = s.length(), c = 0;
        for (int i = 0; i < len; i++) {
            if(s.charAt(i) == letter) c++; 
        } return (c*100)/len;
    }
}
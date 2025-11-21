/*
 * Submission: 1752584405
 * Problem: Check if All A's Appears Before All B's (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-29 15:43:51 UTC
 * Runtime: 0 ms
 * Memory: 41.7 MB
 */

class Solution {
    public boolean checkString(String s) {
        boolean cantB = false;
        int len = s.length();
        for(int i = 0; i < len; i++){
            if (s.charAt(i) == 'b') cantB = true;
            else { if (cantB) return false;}
        } return true;
    }
}
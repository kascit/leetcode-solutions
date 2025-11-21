/*
 * Submission: 1730349881
 * Problem: Maximum 69 Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 16:52:39 UTC
 * Runtime: 0 ms
 * Memory: 40.4 MB
 */

class Solution {
    public int maximum69Number (int num) {
        if (num/1000 == 6) return num + 3000;
        if ((num%1000)/100 == 6) return num + 300;
        if ((num%100)/10 == 6) return num + 30;
        if (num%10 == 6) return num+3;
        return num;
    }
}
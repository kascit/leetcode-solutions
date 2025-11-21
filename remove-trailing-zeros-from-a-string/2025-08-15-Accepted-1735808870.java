/*
 * Submission: 1735808870
 * Problem: Remove Trailing Zeros From a String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 07:34:33 UTC
 * Runtime: 1 ms
 * Memory: 45.1 MB
 */

class Solution {
    public String removeTrailingZeros(String num) {
        int end = num.length() - 1;
        while(num.charAt(end) == '0'){
            end--;
        }
        return num.substring(0,end+1);
    }
}
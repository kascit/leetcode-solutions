/*
 * Submission: 1731069689
 * Problem: Maximum Value of a String in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 10:01:50 UTC
 * Runtime: 2 ms
 * Memory: 41.6 MB
 */

class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs){
            max = Math.max(max, solve(s));
        } return max;
    }
    
    private int solve(String s){
        int ans = -1;
        try {
            ans = Integer.parseInt(s);
        } catch (Exception e) {
            ans = -1;
        } 
        if (ans != -1) return ans;
        else return s.length();
    }
}
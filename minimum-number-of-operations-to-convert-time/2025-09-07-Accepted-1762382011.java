/*
 * Submission: 1762382011
 * Problem: Minimum Number of Operations to Convert Time (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 07:20:44 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

class Solution {
    
    public int convertTime(String current, String correct) {
        int currentMinutes = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(3));
        int targetMinutes = Integer.parseInt(correct.substring(0, 2)) * 60 + Integer.parseInt(correct.substring(3));
        int difference = targetMinutes - currentMinutes;

        int count = 0;

        count += difference / 60;
        difference %= 60;
        count += difference / 15;
        difference %= 15;
        count += difference / 5;
        difference %= 5;
        count += difference;

        return count;
    }
}
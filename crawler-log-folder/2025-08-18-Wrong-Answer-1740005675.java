/*
 * Submission: 1740005675
 * Problem: Crawler Log Folder (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-18 18:26:32 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs){
            if (log.equals("./")) continue;
            else if (log.equals("../")) depth--;
            else depth++;
        }
        return (depth > 0) ? depth : 0;
    }
}
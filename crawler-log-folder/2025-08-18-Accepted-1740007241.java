/*
 * Submission: 1740007241
 * Problem: Crawler Log Folder (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 18:27:42 UTC
 * Runtime: 1 ms
 * Memory: 42.2 MB
 */

class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String log : logs){
            if (log.equals("./")) continue;
            else if (log.equals("../")) depth -= (depth > 0) ? 1 : 0;
            else depth++;
        }
        return depth;
    }
}
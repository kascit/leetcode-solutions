/*
 * Submission: 1747629057
 * Problem: Categorize Box According to Criteria (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 10:53:03 UTC
 * Runtime: 0 ms
 * Memory: 40.8 MB
 */

class Solution {
    public String categorizeBox(int l, int w, int h, int ass) {
        long vol = (long)l*w*h;
        boolean bulk = false, heav = false;
        int dc = (int) 1e4;
        if (l>=dc||w>=dc||h>=dc||vol>=(long)1e9) {
            bulk = true;
        }
        if (ass >= 100) {
            heav = true;
        }

        if (heav && bulk) return "Both";
        if (heav) return "Heavy";
        if (bulk) return "Bulky";
        return "Neither";
    }
}
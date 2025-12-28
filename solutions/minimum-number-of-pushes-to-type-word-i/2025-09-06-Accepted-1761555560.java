/*
 * Submission: 1761555560
 * Problem: Minimum Number of Pushes to Type Word I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 14:25:43 UTC
 * Runtime: 0 ms
 * Memory: 41.9 MB
 */

class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int s=0;
        if(0<n && n<=8)
        s=n;
        else if(8<n && n<=16)
        s=8+(n-8)*2;
        else if(16<n && n<=24)
        s=8+(n-8)*2+(n-16)*1;
        
        else
        s=8+(n-8)*2+(n-16)*1+(n-24);

        return s;
    }
}
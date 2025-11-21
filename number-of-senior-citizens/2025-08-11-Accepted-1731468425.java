/*
 * Submission: 1731468425
 * Problem: Number of Senior Citizens (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 16:35:02 UTC
 * Runtime: 1 ms
 * Memory: 42.8 MB
 */

class Solution {
    public int countSeniors(String[] details) {
        int cnt = 0;
        for(String detail : details){
            if(Integer.parseInt(detail.substring(11,13)) > 60) cnt++;
        } return cnt;
    }
}
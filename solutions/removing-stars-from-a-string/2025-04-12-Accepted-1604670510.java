/*
 * Submission: 1604670510
 * Problem: Removing Stars From a String (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-12 15:13:24 UTC
 * Runtime: 480 ms
 * Memory: 47.9 MB
 */

class Solution {
    public String removeStars(String s) {
        String res = "";
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            if(c != '*' ) {
                if (count == 0){
                    res = c + res;
                } else if (count > 0) count--;
            }
            else count++;
        }
        return res;
    }
}
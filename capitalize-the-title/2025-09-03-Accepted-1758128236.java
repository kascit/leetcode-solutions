/*
 * Submission: 1758128236
 * Problem: Capitalize the Title (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 11:16:02 UTC
 * Runtime: 2 ms
 * Memory: 42.2 MB
 */

class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder(title.toLowerCase());
        int x = -1;
        int k = 0, idx = -1, len = sb.length();
        if ( (x = sb.indexOf(" ") ) > 2 || (x == -1 && len > 2) ) sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        while((idx = sb.indexOf(" ",k)) != -1) {
            int next = sb.indexOf(" ",idx + 1);
            if (next - idx > 3 || (next == -1 && len - idx > 3))
            sb.setCharAt(idx+1,Character.toUpperCase(sb.charAt(idx+1)));
            k = idx + 1;
        }
        return sb.toString();
    }
}
/*
Submission: 1839592764
Status: Accepted
Timestamp: 2025-11-25 17:02:58 UTC
Runtime: 4 ms
Memory: 46.2 MB
*/

class Solution {
    public String removeOccurrences(String s, String part) {
        int len = s.length();
        int p = part.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(s.charAt(i));
            if (sb.length() >= p && sb.substring(sb.length()-p).equals(part)) sb.delete(sb.length()-p,sb.length());
        } return sb.toString();
    }
}
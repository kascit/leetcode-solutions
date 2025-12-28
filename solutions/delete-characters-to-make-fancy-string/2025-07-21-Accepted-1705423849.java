/*
 * Submission: 1705423849
 * Problem: Delete Characters to Make Fancy String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 04:05:14 UTC
 * Runtime: 35 ms
 * Memory: 46.1 MB
 */

class Solution {
    public String makeFancyString(String s) {
        if (s.length() <= 2) return s;
        StringBuilder sb = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len - 2; i++){
            char cur = s.charAt(i), next = s.charAt(i+1), nexto = s.charAt(i+2);
            if (cur == next && cur == nexto){
                continue;
            }
            else sb.append(cur);
        } 

        return sb.append(s.substring(len-2,len)).toString();
    }
}
/*
 * Submission: 1705424789
 * Problem: Delete Characters to Make Fancy String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-21 04:06:24 UTC
 * Runtime: 36 ms
 * Memory: 45.5 MB
 */

class Solution {
    public String makeFancyString(String s) {
        int len = s.length();
        if (len <= 2) return s;
        StringBuilder sb = new StringBuilder();
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
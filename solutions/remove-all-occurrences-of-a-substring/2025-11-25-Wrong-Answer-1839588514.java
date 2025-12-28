/*
Submission: 1839588514
Status: Wrong Answer
Timestamp: 2025-11-25 16:58:35 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.indexOf(part) != -1){
            s = s.replaceAll(part,"");
        }
        return s;
    }
}
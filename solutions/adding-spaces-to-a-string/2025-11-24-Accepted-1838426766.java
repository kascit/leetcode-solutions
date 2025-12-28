/*
Submission: 1838426766
Status: Accepted
Timestamp: 2025-11-24 10:36:11 UTC
Runtime: 20 ms
Memory: 91 MB
*/

class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s.length() + spaces.length);
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            if (j < spaces.length && spaces[j] == i) {
                sb.append(' ');
                j++;
            }
            sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}

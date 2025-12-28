/*
Submission: 1837040640
Status: Accepted
Timestamp: 2025-11-22 18:22:23 UTC
Runtime: 1 ms
Memory: 44 MB
*/

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String norm = prat(pattern);
        List<String> ans = new ArrayList<>();
        // System.out.println(norm);
        for (String w : words) {
            // System.out.println(w+"   "+prat(w));
            if (prat(w).equals(norm)) {
                ans.add(w);
            }
        } return ans;
    }
    String prat(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        // char c = s.charAt(0);
        int[] taken = new int[26];
        int cur = 1;
        for (char ch : s.toCharArray()) {
            if (taken[ch-'a'] == 0) {
                taken[ch-'a'] = cur++;
            }
            sb.append(taken[ch-'a']);
            sb.append('.');
        } return sb.toString();

    }
}
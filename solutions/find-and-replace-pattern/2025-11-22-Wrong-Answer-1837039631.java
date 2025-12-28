/*
Submission: 1837039631
Status: Wrong Answer
Timestamp: 2025-11-22 18:21:05 UTC
Runtime: N/A
Memory: N/A
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
        } return sb.toString();

    }
}
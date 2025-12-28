/*
Submission: 1837042236
Status: Accepted
Timestamp: 2025-11-22 18:24:26 UTC
Runtime: 1 ms
Memory: 43.9 MB
*/

class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String norm = prat(pattern);
        List<String> ans = new ArrayList<>();
        // System.out.println(norm);
        int len = words.length;
        for (int i = 0; i < len; i++) {
            // System.out.println(w+"   "+prat(w));
            String w = words[i];
            if (prat(w).equals(norm)) {
                ans.add(w);
            }
        } return ans;
    }
    String prat(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(len);
        // char c = s.charAt(0);
        int[] taken = new int[26];
        int cur = 1;
        for (int i = 0; i < len; i++) {
            int curr = s.charAt(i)-'a';
            if (taken[curr] == 0) {
                taken[curr] = cur++;
            }
            sb.append(taken[curr]);
            sb.append('.');
        } return sb.toString();

    }
}
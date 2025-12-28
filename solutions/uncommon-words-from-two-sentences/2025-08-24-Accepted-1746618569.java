/*
 * Submission: 1746618569
 * Problem: Uncommon Words from Two Sentences (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 12:56:33 UTC
 * Runtime: 2 ms
 * Memory: 42.3 MB
 */

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a = s1.split(" ");
        String[] b = s2.split(" ");
        Set<String> buzzin = new HashSet<>(a.length);
        Set<String> bussin = new HashSet<>(a.length);
        for (String s : a) {
            if (!buzzin.contains(s)) bussin.add(s);
            else bussin.remove(s);
            buzzin.add(s);
        }
        for (String s : b) {
            if (!buzzin.contains(s)) bussin.add(s);
            else bussin.remove(s);
            buzzin.add(s);
        }
        int idx = 0;
        String[] ans = new String[bussin.size()];
        for (String s : bussin) {
            ans[idx++] = s;
        } return ans;
        
    }
}
/*
 * Submission: 1698895920
 * Problem: Find Words Containing Character (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-15 14:24:37 UTC
 * Runtime: 1 ms
 * Memory: 45.1 MB
 */

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++){
            if (words[i].indexOf(x) != -1) ans.add(i);
        }
        return ans;
    }
}
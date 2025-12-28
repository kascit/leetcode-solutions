/*
 * Submission: 1745523634
 * Problem: String Matching in an Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:13:01 UTC
 * Runtime: 3 ms
 * Memory: 42.5 MB
 */

class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        Arrays.sort(words,
            (a,b) -> Integer.compare(a.length(),b.length())
        );
        int len = words.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i+1; j < len; j++) {
                if (words[j].contains(words[i])) {
                    ans.add(words[i]);
                    break;
                }
            }
        }
        // System.out.println(Arrays.toString(words));
        return ans;
    }
}
/*
 * Submission: 1747599459
 * Problem: Maximum Number of Words You Can Type (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 10:19:13 UTC
 * Runtime: 5 ms
 * Memory: 43 MB
 */

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split("\\s");
        // System.out.println(Arrays.toString(words));
        char[] arr = brokenLetters.toCharArray();
        int ans = 0;
        for (String Word : words) {
            boolean can = true;
            for (char ch : arr) {
                if (Word.contains(Character.toString(ch))) {
                    can = false;
                    break;
                }
            }
            if (can) ans++;
        }
        return ans;
    }
}
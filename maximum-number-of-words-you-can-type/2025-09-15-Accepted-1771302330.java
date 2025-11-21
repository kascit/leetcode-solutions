/*
 * Submission: 1771302330
 * Problem: Maximum Number of Words You Can Type (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-15 07:13:26 UTC
 * Runtime: 3 ms
 * Memory: 43.2 MB
 */

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
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
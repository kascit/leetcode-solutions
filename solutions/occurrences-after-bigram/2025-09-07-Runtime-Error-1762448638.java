/*
 * Submission: 1762448638
 * Problem: Occurrences After Bigram (Easy)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-09-07 08:42:13 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        int len = words.length, idx = 0;
        String[] ans = new String[len/3];
        for (int i = 0; i < len - 2; i++) {
            if (!words[i].equals(first)) continue;
            if (!words[i+1].equals(second)) continue;
            ans[idx++] = words[i+2];
        }
        return Arrays.copyOfRange(ans,0,idx);
    }
}
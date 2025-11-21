/*
 * Submission: 1762796763
 * Problem: Odd String Difference (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-07 15:19:32 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    int[] diff;
    public String oddString(String[] words) {
        for(String word : words) {
            if (diff == null) {
                diff = mar(word);
            }  else {
                if (note(mar(word))) return word;
            }
        } return null;
    }

    private int[] mar(String word) {
        int len = word.length(), cur = word.charAt(0);
        int[] arr = new int[len-1];
        for (int i = 0; i < len - 1; i++) {
            char next = word.charAt(i+1);
            arr[i] = next - cur;
            cur = next;
        } return arr;
    }

    private boolean note(int[] check) {
        for (int i = 0; i < check.length; i++) {
            if (check[i] != diff[i]) return true;
        } return false;
    }
}
/*
 * Submission: 1762807785
 * Problem: Odd String Difference (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 15:31:27 UTC
 * Runtime: 0 ms
 * Memory: 41.3 MB
 */

class Solution {
    int[] diff;
    public String oddString(String[] words) {
        int[] sdiff = null;
        boolean once = false;
        String s = "";
        for(String word : words) {
            if (diff == null) {
                diff = mar(word);
            }  else {
                int[] cdiff = mar(word);
                if (note(cdiff)) {
                    if (!once) {
                        once = true;
                        s = word;
                    } else {
                        return words[0];
                    }
                }
                else {
                    if (once) return s;
                }
            }
        } return s;
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
/*
 * Submission: 1698233657
 * Problem: Valid Word (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-15 03:52:47 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        boolean vowe = false, cons = false;
        String vow = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++){
            if (!Character.isLetterOrDigit(word.charAt(i))) return false;
            if (!vowe && (vow.indexOf(word.charAt(i)) != -1)) {vowe = true;}
            else if (!cons) cons = true;
        }

        return cons && vowe;
    }
}
/*
 * Submission: 1698249705
 * Problem: Valid Word (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-15 04:09:36 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        boolean vowe = false, cons = false;
        String vow = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++){
            //System.out.print"index:" +vow.indexOf(word.charAt(i))
            if (!Character.isLetterOrDigit(word.charAt(i))) return false;
            if (!vowe && (vow.indexOf(word.charAt(i)) != -1)) {
                //System.out.println("vowel wala: "+word.charAt(i) );
                vowe = true;
                }
            else if (!cons && !(vow.indexOf(word.charAt(i)) != -1) && Character.isLetter(word.charAt(i))) {
                //System.out.println(word.charAt(i));
                cons = true;}
        }

        return cons && vowe;
    }
}
/*
 * Submission: 1746159342
 * Problem: Remove All Adjacent Duplicates in String II (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-24 04:34:37 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public String removeDuplicates(String s, int k) {
        int len = s.length();
        int done = 1;
        StringBuilder sb = new StringBuilder(len);
        int[] freq = new int[26];
        for (int i = 0; i < len; i++){
            char cur = s.charAt(i);
            int sblen = sb.length();
            sb.append(cur);
            freq[cur-'a']++;
            // System.out.println(sb+"   "+freq[cur-'a']);
            if ( sblen > 0 ) {
                if (freq[cur-'a'] >= k  && sb.charAt(sb.length()-k) == cur) {
                    sb.delete(sb.length() - k, sb.length());
                    freq[cur-'a'] -= k;
                }
            }
            // System.out.println(sb+"   "+freq[cur-'a']);
        } 
        return sb.toString();
    }
}






















                // if (sb.charAt(sblen - 1) == cur && done < k) {
                //     done++;
                // }
        // if (done > 1) {
        //     sb.delete(sb.length() - done, sb.length());
        // }
                // else if (sb.charAt(sblen - 1) != cur && done > 1) {
                //     sb.delete(sb.length() - done - 1, sb.length()-1);
                //     done = 1;
                // }
                    // System.out.println("<--- ran for\n" + (sb.length()-done) +"     "+sb.length());
                    // done = 1;
            // System.out.println(sb+"   "+done);
/*
 * Submission: 1746167924
 * Problem: Remove All Adjacent Duplicates in String II (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 04:45:41 UTC
 * Runtime: 1381 ms
 * Memory: 44.6 MB
 */

class Solution {
    StringBuilder sb;
    int max;
    public String removeDuplicates(String s, int k) {
        int len = s.length();
        int done = 1;
        sb = new StringBuilder(len);
        max = k;
        int[] freq = new int[26];
        for (int i = 0; i < len; i++){
            char cur = s.charAt(i);
            int sblen = sb.length();
            sb.append(cur);
            freq[cur-'a']++;
            // System.out.println(sb+"\t\t\t\t\t"+freq[cur-'a'] +"\t\t\t\t\t"+cur);
            if ( sblen > 0 ) {
                if (freq[cur-'a'] >= k  && canDo(cur)) {
                    sb.delete(sb.length() - k, sb.length());
                    freq[cur-'a'] -= k;
                }
            }
            // System.out.println(sb+"   "+freq[cur-'a']);
            // System.out.println(sb+"\t\t\t\t\t"+freq[cur-'a'] +"\t\t\t\t\t"+cur);
        } 
        return sb.toString();
    }
    private boolean canDo(char cur){
        for (int i = 1; i <= max; i ++) {
            if (sb.charAt(sb.length()-i) != cur) return false;
        } return true;
        
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
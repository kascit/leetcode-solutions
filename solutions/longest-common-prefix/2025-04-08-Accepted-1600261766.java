/*
 * Submission: 1600261766
 * Problem: Longest Common Prefix (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-08 05:05:13 UTC
 * Runtime: 12 ms
 * Memory: 44.9 MB
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        String thingy = common(strs[0], strs[1]);
        if (strs.length == 2) return thingy;
        for (int i = 2; i < strs.length; i++){
            thingy = common(
                thingy, strs[i]
            );

        }
        return thingy;
    }
    public String common(String a, String b){
        String res = "";
        if (a.length() == 0 || b.length() == 0) return res;
        char[] aa = a.toCharArray(), bb = b.toCharArray();
        for(int i = 0; i < Math.min(a.length(),b.length()); i++){
            if (aa[i] == bb[i]) res += aa[i];
            else return res;
        }
        return res;
    }
    
}
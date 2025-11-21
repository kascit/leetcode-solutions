/*
 * Submission: 1735905920
 * Problem: Determine if String Halves Are Alike (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-15 09:19:56 UTC
 * Runtime: 5 ms
 * Memory: 41.8 MB
 */

class Solution {
    public boolean halvesAreAlike(String s) {
        int vow = 0, cons = 0;
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        String v = "aeiouAEIOU";
        while(l < r){
            vow += (v.indexOf(arr[l]) != -1) ? 1 : 0;
            vow -= (v.indexOf(arr[r]) != -1) ? 1 : 0;
            cons += (v.indexOf(arr[l++]) != -1) ? 1 : 0;
            cons -= (v.indexOf(arr[r--]) != -1) ? 1 : 0;
        }
        return (vow == 0 && cons == 0);
    }
}
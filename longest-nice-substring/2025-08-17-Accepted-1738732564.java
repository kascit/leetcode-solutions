/*
 * Submission: 1738732564
 * Problem: Longest Nice Substring (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-17 16:28:24 UTC
 * Runtime: 7 ms
 * Memory: 41.3 MB
 */

class Solution {
    public String longestNiceSubstring(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length, max = 0, it = 0, jt = 0;
        for (int i = 0; i < len - 1; i++){
            for (int j = i + 1; j < len; j++){
                int cur = -1;
                if (isNice(arr,i,j)) cur = j - i + 1;
                if (cur > max){
                    it = i;
                    jt = j;
                    max = cur;
                }
            }
        } return (jt > it) ? s.substring(it,jt+1) : "";
    }

    private boolean isNice(char[] arr, int l, int r) {
        int low = 0, upp = 0;
        for(int i = l; i <= r; i++){
            int cur = arr[i];
            if ( cur < 'a') upp |= 1<<(cur-'a');
            else low |= 1<<(cur-'A');
        }
        return low == upp;
    }
}
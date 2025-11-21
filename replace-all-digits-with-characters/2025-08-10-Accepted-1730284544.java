/*
 * Submission: 1730284544
 * Problem: Replace All Digits with Characters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:50:54 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    private char[] arr;
    public String replaceDigits(String s) {
        arr = s.toCharArray();
        int len = arr.length;
        for (int i = 1; i < len; i+=2){
            shift(i);
        }
        return new String(arr);
    }
    private void shift(int i){
        arr[i] = (char) (arr[i-1]+arr[i]-'0');
    }
}
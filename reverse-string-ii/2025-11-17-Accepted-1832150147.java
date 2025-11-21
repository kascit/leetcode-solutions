/*
 * Submission: 1832150147
 * Problem: Reverse String II (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-17 09:23:50 UTC
 * Runtime: 1 ms
 * Memory: 44.8 MB
 */

class Solution {
    public String reverseStr(String s, int k) {
        int p = 2*k;
        int i = 0, n = s.length();
        char[] arr = s.toCharArray();
        while(i<n) {
            int end = Math.min(i + k - 1, n - 1);  
            rev(arr, i, end);                      
            i = i + p;
        }
        return new String(arr);
    }
    public void rev(char[] sb, int i, int j) {
        while(i<j) {
            char temp = sb[i];
            sb[i] = sb[j];
            sb[j] = temp;
            i++;
            j--;
        }
    }
}
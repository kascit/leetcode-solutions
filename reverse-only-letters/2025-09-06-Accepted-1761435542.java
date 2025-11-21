/*
 * Submission: 1761435542
 * Problem: Reverse Only Letters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 12:01:42 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j;) {
            if ( !((arr[i] >= 'a' && arr[i] <= 'z') || (arr[i] >= 'A' && arr[i] <= 'Z')) ) {
                i++;
                continue;
            }
            if ( !((arr[j] >= 'a' && arr[j] <= 'z') || (arr[j] >= 'A' && arr[j] <= 'Z')) ) {
                j--;
                continue;
            }
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;j--;
        }
        return new String(arr);
    }
}
/*
 * Submission: 1761436211
 * Problem: Reverse Only Letters (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 12:02:34 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}

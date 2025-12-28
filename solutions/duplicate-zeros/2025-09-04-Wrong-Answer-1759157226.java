/*
 * Submission: 1759157226
 * Problem: Duplicate Zeros (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-04 08:46:56 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public void duplicateZeros(int[] arr) {
        int next = -1, len = arr.length;
        for(int i = 0; i < len; i++) {
            if(arr[i] == 0) {
                if (next == -1) {
                    next = 0;
                    continue;
                } else {
                    // System.out.println(Arrays.toString(arr));
                    if (i < len) arr[i++] = next;
                    // System.out.println(Arrays.toString(arr));
                    if (i < len) {
                        next = arr[i];
                        arr[i++] = 0;
                    }
                    // System.out.println(Arrays.toString(arr));
                    if (i < len) arr[i] = 0;
                    // System.out.println(Arrays.toString(arr) + next);
                    continue;
                }
            }
            if (i < len && next != -1) {
                int t = next;
                next = arr[i];
                arr[i] = t;
            }
        }
    }
}
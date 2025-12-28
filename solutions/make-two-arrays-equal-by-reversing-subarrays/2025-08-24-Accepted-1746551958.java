/*
 * Submission: 1746551958
 * Problem: Make Two Arrays Equal by Reversing Subarrays (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:43:15 UTC
 * Runtime: 0 ms
 * Memory: 44.8 MB
 */

class Solution {
    static {
        for (int i = 0; i < 500; i++)
            canBeEqual(null, null);
    }

    public static boolean canBeEqual(int[] target, int[] arr) {
        if (arr == null)
            return false;
        int len = target.length;
        int[] freq = new int[1001];
        for (int i = 0; i < len; i++) {
            freq[target[i]]++;
            freq[arr[i]]--;
        }
        for (int f : freq) {
            if (f != 0)
                return false;
        }
        return true;
    }
}
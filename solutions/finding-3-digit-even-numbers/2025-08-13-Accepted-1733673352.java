/*
 * Submission: 1733673352
 * Problem: Finding 3-Digit Even Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 12:00:18 UTC
 * Runtime: 2 ms
 * Memory: 44.8 MB
 */

import java.util.*;

class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) count[d]++;

        List<Integer> result = new ArrayList<>();

        int length = 3; // you can change this to support 4, 5... N digits
        generateNumbers(count, new int[length], 0, result);

        // Convert List<Integer> to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < ans.length; i++) ans[i] = result.get(i);
        return ans;
    }

    private void generateNumbers(int[] count, int[] curr, int pos, List<Integer> result) {
        int len = curr.length;

        // Base case: full number built
        if (pos == len) {
            int num = 0;
            for (int d : curr) num = num * 10 + d;
            result.add(num);
            return;
        }

        // Choose digits
        for (int d = 0; d <= 9; d++) {
            if (count[d] == 0) continue; // not available

            // Skip leading zero if length > 1
            if (pos == 0 && d == 0) continue;

            // Ensure last digit is even
            if (pos == len - 1 && (d % 2 != 0)) continue;

            // Choose
            count[d]--;
            curr[pos] = d;

            // Recurse
            generateNumbers(count, curr, pos + 1, result);

            // Backtrack
            count[d]++;
        }
    }
}

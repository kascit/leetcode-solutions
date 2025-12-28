/*
 * Submission: 1758464036
 * Problem: Unique 3-Digit Even Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 17:01:32 UTC
 * Runtime: 5 ms
 * Memory: 45.2 MB
 */

class Solution {
    int ans = 0;
    Set<Integer> seen = new HashSet<>();

    public int totalNumbers(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) freq[d]++;
        backtrack(0, 0, freq);
        return ans;
    }

    private void backtrack(int num, int len, int[] freq) {
        if (len == 3) {
            if ((num % 2 == 0) && !seen.contains(num)) {
                ans++;
                seen.add(num);
            }
            return;
        }

        for (int d = 0; d <= 9; d++) {
            if (freq[d] == 0) continue;
            if (len == 0 && d == 0) continue;

            freq[d]--;
            backtrack(num * 10 + d, len + 1, freq);
            freq[d]++;
        }
    }
}

/*
 * Submission: 1733647042
 * Problem: Finding 3-Digit Even Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 11:29:19 UTC
 * Runtime: 2 ms
 * Memory: 44.6 MB
 */

import java.util.Arrays;

class Solution {
    private static final int MAX_NUMS = 450;
    private static final int DIGIT_BITS = 3;

    private static final int[][] DIGIT_MASKS = new int[10][3]; // [digit][occurrence]
    private static final int[] freqs = new int[MAX_NUMS];

    static {
        // Precompute masks for digits 0-9 with up to 3 occurrences
        for (int d = 0; d <= 9; d++) {
            int bitPos = d * DIGIT_BITS;
            DIGIT_MASKS[d][0] = 1 << bitPos;
            DIGIT_MASKS[d][1] = 1 << (bitPos + 1);
            DIGIT_MASKS[d][2] = 1 << (bitPos + 2);
        }
        // Precompute frequency masks for even numbers 100–998
        int idx = 0;
        for (int num = 100; num <= 998; num += 2) {
            freqs[idx++] = buildFreqMask(num);
        }
    }

    private static int buildFreqMask(int num) {
        int mask = 0;
        int[] count = new int[10];
        while (num > 0) {
            int d = num % 10;
            mask |= DIGIT_MASKS[d][count[d]++];
            num /= 10;
        }
        return mask;
    }

    public int[] findEvenNumbers(int[] digits) {
        int inputMask = 0;
        int[] count = new int[10];
        int maxDigit = -1;

        for (int d : digits) {
            if (count[d] < 3) {
                inputMask |= DIGIT_MASKS[d][count[d]++];
                if (d > maxDigit) maxDigit = d;
            }
        }

        // Check for even digit presence in mask
        boolean hasEven = false;
        for (int e = 0; e <= 8; e += 2) {
            if ((inputMask & DIGIT_MASKS[e][0]) != 0) {
                hasEven = true;
                break;
            }
        }
        if (!hasEven) return new int[0];

        // Limit search range by largest possible hundred's digit
        int limit = Math.min(MAX_NUMS, ((maxDigit + 1) * 100) / 2);
        int[] result = new int[MAX_NUMS];
        int idx = 0;

        for (int i = 0; i < limit; i++) {
            if ((freqs[i] & inputMask) == freqs[i]) {
                result[idx++] = 100 + (i * 2);
            }
        }
        return Arrays.copyOf(result, idx);
    }
}

/*
 * Submission: 1733630346
 * Problem: Finding 3-Digit Even Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 11:10:06 UTC
 * Runtime: 2 ms
 * Memory: 44.6 MB
 */

import java.util.Arrays;

class Solution {
    private static final int MAX_NUMS = 450;
    private static final int DIGIT_BITS = 3;
    private static final int[] freqs = new int[MAX_NUMS];

    static {
        int idx = 0;
        for (int num = 100; num <= 998; num += 2) {
            freqs[idx++] = buildFreqMask(num);
        }
    }

    private static int buildFreqMask(int num) {
        int mask = 0;
        while (num > 0) {
            int bitPos = (num % 10) * DIGIT_BITS;
            if ((mask & (1 << bitPos)) == 0)
                mask |= 1 << bitPos;
            else if ((mask & (1 << (bitPos + 1))) == 0)
                mask |= 1 << (bitPos + 1);
            else
                mask |= 1 << (bitPos + 2);
            num /= 10;
        }
        return mask;
    }

    public int[] findEvenNumbers(int[] digits) {
        int inputMask = 0;
        boolean hasEven = false;
        for (int d : digits) {
            int bitPos = d * DIGIT_BITS;
            if ((d & 1) == 0) hasEven = true;
            if ((inputMask & (1 << bitPos)) == 0)
                inputMask |= 1 << bitPos;
            else if ((inputMask & (1 << (bitPos + 1))) == 0)
                inputMask |= 1 << (bitPos + 1);
            else
                inputMask |= 1 << (bitPos + 2);
        }
        if (!hasEven) return new int[0];
        int[] result = new int[MAX_NUMS];
        int idx = 0;
        for (int i = 0; i < MAX_NUMS; i++) {
            if ((freqs[i] & inputMask) == freqs[i]) {
                result[idx++] = 100 + (i * 2);
            }
        }
        return Arrays.copyOf(result, idx);
    }
}

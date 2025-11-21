/*
 * Submission: 1733634612
 * Problem: Finding 3-Digit Even Numbers (Easy)
 * Status: Internal Error
 * Language: java
 * Timestamp: 2025-08-13 11:15:39 UTC
 * Runtime: N/A
 * Memory: N/A
 */

import java.util.Arrays;

class Solution {
    private static final int DIGIT_BITS = 3;

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
        int[] counts = new int[10];
        int inputMask = 0;

        for (int d : digits) {
            counts[d]++;
            int bitPos = d * DIGIT_BITS;
            if ((inputMask & (1 << bitPos)) == 0)
                inputMask |= 1 << bitPos;
            else if ((inputMask & (1 << (bitPos + 1))) == 0)
                inputMask |= 1 << (bitPos + 1);
            else
                inputMask |= 1 << (bitPos + 2);
        }

        // If no even digit in input, return early
        if ((inputMask & ((1 << 0) | (1 << (2 * DIGIT_BITS)) | (1 << (4 * DIGIT_BITS)) |
                          (1 << (6 * DIGIT_BITS)) | (1 << (8 * DIGIT_BITS)))) == 0)
            return new int[0];

        int[] result = new int[450];
        int idx = 0;

        for (int num = 100; num <= 998; num += 2) {
            int mask = buildFreqMask(num);
            if ((mask & inputMask) != mask) continue;

            // Extra digit count check
            int tmp = num;
            int[] need = new int[10];
            boolean ok = true;
            while (tmp > 0) {
                int digit = tmp % 10;
                if (++need[digit] > counts[digit]) {
                    ok = false;
                    break;
                }
                tmp /= 10;
            }
            if (ok) result[idx++] = num;
        }

        return Arrays.copyOf(result, idx);
    }
}

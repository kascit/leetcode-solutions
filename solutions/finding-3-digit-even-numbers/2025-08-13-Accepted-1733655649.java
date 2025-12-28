/*
 * Submission: 1733655649
 * Problem: Finding 3-Digit Even Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 11:39:18 UTC
 * Runtime: 1 ms
 * Memory: 44.7 MB
 */

import java.util.Arrays;

class Solution {
    private static final int MAX_NUMS = 450;
    private static final int DIGIT_BITS = 3;
    private static final int[] freqs = new int[MAX_NUMS];

    static {
        int idx = 0;
        for (int num = 100; num <= 998; num += 2) {
            int mask = 0, t = num;
            while (t > 0) {
                int bitPos = (t % 10) * DIGIT_BITS;
                if ((mask & (1 << bitPos)) == 0)
                    mask |= 1 << bitPos;
                else if ((mask & (1 << (bitPos + 1))) == 0)
                    mask |= 1 << (bitPos + 1);
                else
                    mask |= 1 << (bitPos + 2);
                t /= 10;
            }
            freqs[idx++] = mask;
        }
    }

    public int[] findEvenNumbers(int[] digits) {
        int inputMask = 0;
        int maxDigit = -1;
        int[] count = new int[10];

        for (int d : digits) {
            if (d > maxDigit) maxDigit = d;
            if (count[d] < 3) {
                int bitPos = d * DIGIT_BITS + count[d];
                inputMask |= 1 << bitPos;
                count[d]++;
            }
        }

        // Check even presence after building mask
        boolean hasEven = false;
        for (int e = 0; e <= 8; e += 2) {
            if ((inputMask & (1 << (e * DIGIT_BITS))) != 0) {
                hasEven = true;
                break;
            }
        }
        if (!hasEven) return new int[0];

        // Upper bound using largest possible hundred's digit
        int maxNum = (maxDigit + 1) * 100;
        if (maxNum > 998) maxNum = 998;
        int maxIdx = (maxNum - 100) / 2;

        int[] result = new int[MAX_NUMS];
        int idx = 0;
        for (int i = 0; i <= maxIdx; i++) {
            if ((freqs[i] & inputMask) == freqs[i]) {
                result[idx++] = 100 + i * 2;
            }
        }
        return Arrays.copyOf(result, idx);
    }
}

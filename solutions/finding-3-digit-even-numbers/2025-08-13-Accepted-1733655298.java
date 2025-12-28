/*
 * Submission: 1733655298
 * Problem: Finding 3-Digit Even Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-13 11:38:52 UTC
 * Runtime: 4 ms
 * Memory: 44.8 MB
 */

import java.util.Arrays;

class Solution {
    private final int MAX_NUMS = 450;
    private final int DIGIT_BITS = 3;
    private final int[] freqs = new int[MAX_NUMS];

    public Solution() {
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
        for (int d : digits) {
            int bitPos = d * DIGIT_BITS;
            if ((inputMask & (1 << bitPos)) == 0)
                inputMask |= 1 << bitPos;
            else if ((inputMask & (1 << (bitPos + 1))) == 0)
                inputMask |= 1 << (bitPos + 1);
            else
                inputMask |= 1 << (bitPos + 2);
        }

        boolean hasEven = false;
        int maxDigit = -1;
        for (int e = 0; e <= 9; e++) {
            if ((inputMask & (1 << (e * DIGIT_BITS))) != 0) {
                if (e % 2 == 0) hasEven = true;
                if (e > maxDigit) maxDigit = e;
            }
        }
        if (!hasEven) return new int[0];

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

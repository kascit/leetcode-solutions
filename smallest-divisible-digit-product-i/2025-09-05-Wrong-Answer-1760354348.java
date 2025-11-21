/*
 * Submission: 1760354348
 * Problem: Smallest Divisible Digit Product I (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-05 10:41:40 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int smallestNumber(int n, int t) {
        int hundo = n/100;
        int tendo = (n%100)/10;
        int onedo = n%10;
        while ( (Math.max(hundo,1)*tendo*onedo) % t != 0) {
            if (onedo == 9) {
                onedo = 0;
                if (tendo == 9) {
                    tendo = 0;
                    hundo++;
                } else tendo++;
            } else onedo++;
        }
        return hundo*100+tendo*10+onedo;
    }
}
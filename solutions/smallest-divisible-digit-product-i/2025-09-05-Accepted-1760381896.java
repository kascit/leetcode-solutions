/*
 * Submission: 1760381896
 * Problem: Smallest Divisible Digit Product I (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-05 11:14:26 UTC
 * Runtime: 1 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int smallestNumber(int n, int t) {
        int hundo = n/100;
        int tendo = (n%100)/10;
        int onedo = n%10;
        boolean tender = false;
        if (tendo == 0) tender = true;
        while ( tender && onedo%t != 0 || (tendo*onedo) % t != 0) {
            if (onedo == 9) {
                tender = false;
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
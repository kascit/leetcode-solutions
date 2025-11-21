/*
 * Submission: 1746721609
 * Problem: Largest Number After Digit Swaps by Parity (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-24 14:41:01 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int largestInteger(int num) {
        int[] odds = new int[9];
        int[] evens = new int[9];
        int o = 0, e = 0, check = 0, order = 0;
        while (num > 0) {
            int cur = num%10;
            if (cur%2 == 1) {
                check |= 1<<order;
                odds[o++] = cur;
            } else evens[e++] = cur; 
            order++;
            num /= 10;
        }
       Arrays.sort(odds, 0, o);
Arrays.sort(evens, 0, e);

// System.out.println("Odds: " + order);
// System.out.println("odds: " + Arrays.toString(odds));
// System.out.println("Evens: " + Arrays.toString(evens));

// System.out.println(Integer.toBinaryString(check)); // output: 1101
        while (order>0) {
            if ( (check & 1<<(order-1)) == 0 ) {
                num += evens[--e];
            } else {
                num += odds[--o];
            }
            num*=10;
            order--;
        }

        return num/10;
    }
        // int t = num, order = 1, Emax = 0, Omax = 0, minPosO = 0, minPosE = 0;
        // while (t > 0) {
        //     int cur = t%10;
        //     if (cur%2 == 0) {
        //         if (cur >= Emax) Emax = cur;
        //         else minPosE = order;

        //     } else {
        //         if (cur >= Omax) Omax = cur;
        //         else minPosO = order;
        //     }
        //     order *= 10;
        //     t/=10;
        // }
        // System.out.println("Emax: " + Emax + ", minPosE: " + minPosE);
        // System.out.println("Omax: " + Omax + ", minPosO: " + minPosO);
        // if (minPosE > minPosO){
        //     num = num%minPosE + Emax*minPosE;
        // } else {
        //     num = num%minPosO + Omax*minPosO;
        // }
}
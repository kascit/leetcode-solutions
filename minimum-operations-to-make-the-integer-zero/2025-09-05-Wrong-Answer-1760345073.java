/*
 * Submission: 1760345073
 * Problem: Minimum Operations to Make the Integer Zero (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-05 10:30:25 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        int lastBit = 1;
        while(lastBit<<1<num1) {
            lastBit<<=1;
        }
        // System.out.println(Integer.toBinaryString(num1));
        // System.out.println(Integer.toBinaryString(lastBit));
        int c = 32, ans = 0;
        // if (num2<0) return -99;
        // int n = 99861952 - 12311*15;
        // System.out.println(Integer.bitCount(n));
        
        while (c>0 && num1 > num2) {
            ans++;
            num1 -= num2;
            int bitC = Integer.bitCount(num1);
            // debug("num: ",num1);
            // debug("bitCount: ",bitC);
            // debug("ans: ",ans);
            if (ans >= Integer.bitCount(num1) && ans <= num1) return ans;
            c--;
        }
        return -1;
    }
    private static void debug(String label, int value) {
    System.out.printf("%-18s %12d   (%s)%n", label + ":", value, Integer.toBinaryString(value));
}



    
}
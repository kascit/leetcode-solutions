/*
 * Submission: 1744537844
 * Problem: Maximum Difference by Remapping a Digit (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-22 16:22:33 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int minMaxDifference(int num) {
        int max = 0, min = 0, t = num;
        int replace = 0, check = (int) 1e8;
        int order = 1;
        while(num<check){
            check/=10;
        }
        // System.out.println(check);
        replace = num/check;
        int replaceM = replace;
        boolean change = false;
        if (replace == 9) {
            change = true;
        }
        while(t>0){
            int cur = t%10;
            if (cur != 9 && change){
                replace = cur;
                change = false;
            }
            if (cur == replace) cur = 9;
            cur*=order;
            max += cur;
            t/=10;
            order*=10;
        }
        // System.out.println(max);
        t = num;
        order = 1;
        while(t>0){
            int cur = t%10;
            if (cur == replaceM) cur = 0;
            cur*=order;
            min += cur;
            t/=10;
            order*=10;
        }
        // System.out.println(min);
        return max - min;
    }
}
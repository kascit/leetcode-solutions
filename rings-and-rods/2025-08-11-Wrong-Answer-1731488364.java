/*
 * Submission: 1731488364
 * Problem: Rings and Rods (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-11 16:49:31 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int countPoints(String rings) {
        int mask = 0;
        int check = 0b111;
        int r = 0b1;
        int g = 0b10;
        int b = 0b100;
        int cnt = 0;
        
        char[] rr = rings.toCharArray();
        for(int i = 0; i < rr.length - 1; i+=2){
            int put = b;
            if (rr[i] == 'R'){
                put = r;
            } else if (rr[i] == 'G'){
                put = g;
            }
            int times = rr[i+1] - '0';
            mask |= (put<<times);
        }

        while(mask > 0){
            if ((mask & check) == check) cnt++;
            mask>>=3;
        } return cnt;


    }
}
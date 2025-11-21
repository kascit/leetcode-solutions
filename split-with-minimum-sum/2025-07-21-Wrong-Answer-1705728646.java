/*
 * Submission: 1705728646
 * Problem: Split With Minimum Sum (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-21 09:17:48 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int splitNum(int num) {
        int[] freq = new int[10];
        while(num > 0){
            freq[num%10]++;
            num /= 10;
        }

        int first = 0, second = 0;
        for (int i = 0; i < 10; i++){
            if (i < 10 && freq[i] > 0){
                first *= 10;
                first += i;
                freq[i]--;
            }
            while (i < 10 && freq[i] < 1) i++;
            if (i < 10 && freq[i] > 0){
                second *= 10;
                second += i;
                freq[i]--;
            }
        }
        return first + second;
    }
}
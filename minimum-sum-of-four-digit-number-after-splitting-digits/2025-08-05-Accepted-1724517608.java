/*
 * Submission: 1724517608
 * Problem: Minimum Sum of Four Digit Number After Splitting Digits (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 15:02:51 UTC
 * Runtime: 0 ms
 * Memory: 40.3 MB
 */

class Solution {
    public int minimumSum(int num) {
        int[] freq = new int[10];
        int len = 0;
        while (num > 0) {
            int cur = num % 10;
            freq[cur]++;
            num /= 10;
        }
        int t = 0, ans = 0;
        for (int i = 0; i < 10; i++){
            while (freq[i] > 0){
                freq[i]--;
                if (t < 2){
                    ans += i*10;
                    t++;
                } else ans += i;
            }
        } return ans;



    }
}
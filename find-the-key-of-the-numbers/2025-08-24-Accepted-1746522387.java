/*
 * Submission: 1746522387
 * Problem: Find the Key of the Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-24 11:11:11 UTC
 * Runtime: 1 ms
 * Memory: 40.7 MB
 */

class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ans = 0, order = 1;
        int k = 4;
        while(k-->0) {
            int cur = (Math.min(num1%10,Math.min(num2%10,num3%10)))*order;
            num1/=10;
            num2/=10;
            num3/=10;
            order*=10;
            ans += cur;
        } return ans;
    }
}
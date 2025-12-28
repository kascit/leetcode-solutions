/*
 * Submission: 1722011079
 * Problem: Sum of Digits of String After Convert (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-03 15:01:02 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for(char ch : s.toCharArray()){
            int cur = ch-'a' + 1;
            if (cur < 10) sum += cur;
            else sum += cur/10 + cur%10;
        }
        k-=1;
        int num = 0;
        while(k-->0){
            while(sum>0){
                num += sum%10;
                sum/=10;
            }
            sum = num;
        } return sum;
        
    }
}
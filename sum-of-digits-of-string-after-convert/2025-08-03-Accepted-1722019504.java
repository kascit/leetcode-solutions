/*
 * Submission: 1722019504
 * Problem: Sum of Digits of String After Convert (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-03 15:09:30 UTC
 * Runtime: 0 ms
 * Memory: 41.5 MB
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
        
        while(k-->0){
            int num = 0;
            while(sum>0){
                num += sum%10;
                sum/=10;
            }
            sum = num;
            // System.out.println(sum);
        } return sum;
        
    }
}
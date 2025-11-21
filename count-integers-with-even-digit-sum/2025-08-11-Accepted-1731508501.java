/*
 * Submission: 1731508501
 * Problem: Count Integers With Even Digit Sum (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-11 17:03:59 UTC
 * Runtime: 0 ms
 * Memory: 40.3 MB
 */

class Solution {
    public int countEven(int num) {
        return (num)/2 - ((num&1)^1)*even(num);
    }
    int even(int num){
        int sum = 0;
        while(num>0){
            sum+= num%10;
            num/=10;
        }
        return sum&1;
    }
}
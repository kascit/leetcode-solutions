/*
 * Submission: 1761349218
 * Problem: Find The Least Frequent Digit (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 10:15:56 UTC
 * Runtime: 1 ms
 * Memory: 40.8 MB
 */

class Solution {
    public int getLeastFrequentDigit(int n) {
        int min = 0;
        int[] freq = new int[10];
        while(n>0){
            freq[n%10]++;
            n/=10;
        }
        for(int i = 1; i<10; i++) {
            if (freq[i] == 0) continue;
            if (freq[min] == 0) min = i;
            else if (freq[i] < freq[min]) {
                min = i;
            }
        } return min;
    }
}
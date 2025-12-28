/*
 * Submission: 1701468741
 * Problem: Reduce Array Size to The Half (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-17 15:54:35 UTC
 * Runtime: 5 ms
 * Memory: 55.6 MB
 */

class Solution {
    public int minSetSize(int[] arr) {
        int max=0;
        for(int n:arr){
            max=Math.max(max,n);
        }
        int[] freq=new int[max+1];
        max=0;
        for(int n:arr){
            freq[n]++;
            max=Math.max(max,freq[n]);
        }
        int[] freqCount=new int[max+1];
        for(int f:freq){
            freqCount[f]++;
        }
        int count=0;
        int half=arr.length/2;
        for(int i=max;i>=1;i--){
            while(freqCount[i]>0&&half>0){
                half-=i;
                count++;
                freqCount[i]--;
            }
        }
        return count;
    }
}
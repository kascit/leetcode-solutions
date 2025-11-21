/*
 * Submission: 1759264139
 * Problem: Duplicate Zeros (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-04 10:50:03 UTC
 * Runtime: 1 ms
 * Memory: 44.6 MB
 */

class Solution {
    public void duplicateZeros(int[] arr) {
        int numZeros = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] == 0) 
                numZeros++;
        int i = arr.length - 1;
        int j = i + numZeros;
        while(i != j){
            if(arr[i] != 0){
                if(j < arr.length) arr[j] = arr[i];
            }else{
                if(j < arr.length) arr[j] = arr[i];
                j--;
                if(j < arr.length) arr[j] = arr[i];
            }
            i--;
            j--;
        }
    }
}
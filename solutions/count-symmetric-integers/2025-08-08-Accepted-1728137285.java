/*
 * Submission: 1728137285
 * Problem:   Count Symmetric Integers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-08 16:23:04 UTC
 * Runtime: 10 ms
 * Memory: 41.3 MB
 */

class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for(int i = low; i <= high; i++){
            int a = 0, b = 0;
            if (i < 10 ){
                i = 11;
            } else if (i > 99 && i < 1000){
                i = 1001;
            } else if(i > 9999) break;
            if (i > high) break;
            if (i < 100){
                
                if (i/10 == i%10) {ans++;}
            } else {
                
                if (i/1000 + (i/100)%10 == (i%100)/10 + i%10) {ans++;}
            }
        } return ans;
    }
}
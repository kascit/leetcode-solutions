/*
 * Submission: 1726974413
 * Problem: Lemonade Change (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-07 15:00:08 UTC
 * Runtime: 2 ms
 * Memory: 56.2 MB
 */

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0, tens = 0;
        for(int cash : bills){
            if (cash == 5) {
                fives++;
            }
            
            else if (cash == 10) {
                if (fives < 1) return false;
                fives--;
                tens++;
            }
            else {
                if (fives < 1) return false;
                if (fives < 3 && tens < 1) return false;
                if (tens > 0) {tens--; fives--;}
                else fives-=3;

            }
        } return true;
    }
}
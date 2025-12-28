/*
 * Submission: 1702576806
 * Problem: Prime In Diagonal (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-18 15:39:26 UTC
 * Runtime: 2 ms
 * Memory: 59.4 MB
 */

class Solution {
    public int diagonalPrime(int[][] nums) {
        int prime = 0, n = nums.length, numb = 0;
        for ( int i = 0; i < n; i++ ){
            for ( int j = 0; j < n; j++ ){
                if (i == j || i + j == n - 1) {
                    numb = nums[i][j];
                    if (numb > prime && isPrime(numb)){
                        prime = numb;
                    }
                }
            }
        }
        return prime;
    }

    public boolean isPrime(int num){
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
/*
 * Submission: 1702573437
 * Problem: Prime In Diagonal (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-07-18 15:36:02 UTC
 * Runtime: N/A
 * Memory: N/A
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
        for (int i = 2; i < Math.sqrt(num); i++){
            if (num % i == 0) return false;
        }
        return true;
    }
}
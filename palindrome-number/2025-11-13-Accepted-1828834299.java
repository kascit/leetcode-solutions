/*
 * Submission: 1828834299
 * Problem: Palindrome Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-13 15:22:05 UTC
 * Runtime: 4 ms
 * Memory: 46.1 MB
 */

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x < 10) return true;
        else {
            int y = x, z = 0;
            while(y > 0){
                z *= 10;
                z += y%10;
                y /= 10;
            }
            return z == x;
        }
    }
}
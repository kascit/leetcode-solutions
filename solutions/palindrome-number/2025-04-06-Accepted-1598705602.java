/*
 * Submission: 1598705602
 * Problem: Palindrome Number (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-06 16:32:03 UTC
 * Runtime: 5 ms
 * Memory: 43.5 MB
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
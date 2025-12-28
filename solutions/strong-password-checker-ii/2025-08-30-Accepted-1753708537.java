/*
 * Submission: 1753708537
 * Problem: Strong Password Checker II (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-30 15:34:31 UTC
 * Runtime: 0 ms
 * Memory: 41.6 MB
 */

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if (password.length()<8)return false;
        int check = 1;
        char prev = 0;
        for (char ch : password.toCharArray()) {
            if (ch >= '0' && ch <='9') check |= 2;
            else if (ch >= 'a' && ch <='z') check |= 4;
            else if (ch >= 'A' && ch <='Z') check |= 8;
            else check |= 16;
            if (ch == prev) check &= 31-1;
            prev = ch;
        } return check == 31;
    }
}
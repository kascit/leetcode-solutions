/*
 * Submission: 1718510712
 * Problem: Add Binary (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-31 15:43:20 UTC
 * Runtime: 1 ms
 * Memory: 42.4 MB
 */

class Solution {
    public String addBinary(String a, String b) {
        char[] charArrA = a.toCharArray();
        char[] charArrB = b.toCharArray();
        StringBuilder sb = new StringBuilder();

        int i = charArrA.length - 1, j = charArrB.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int aNum = i >= 0 ? charArrA[i] - '0' : 0;
            int bNum = j >= 0 ? charArrB[j] - '0' : 0;

            int sum = aNum + bNum + carry;
            int digit = sum % 2;
            carry = sum / 2;
            i--;
            j--;

            sb.append((char)(digit + '0'));
        }

        return sb.reverse().toString();
    }
}
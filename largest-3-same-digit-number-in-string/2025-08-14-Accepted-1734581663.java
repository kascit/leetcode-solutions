/*
 * Submission: 1734581663
 * Problem: Largest 3-Same-Digit Number in String (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 06:10:03 UTC
 * Runtime: 1 ms
 * Memory: 42.1 MB
 */

class Solution {
    public String largestGoodInteger(String num) {
        int max = 0, len = num.length();
        boolean found = false;
        for(int i = 0; i < len - 2; i++){
            if (num.charAt(i) == num.charAt(i+1)){
                if (num.charAt(i) == num.charAt(i+2)){
                    if (!found) max = i;
                    found = true;
                    max = (num.charAt(max)-'0' > num.charAt(i)-'0') ? max : i;
                    i+=2;
                }
            }
        }
        return (!found) ? "" : num.substring(max,max+3);
    }
}
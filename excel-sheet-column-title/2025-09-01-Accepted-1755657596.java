/*
 * Submission: 1755657596
 * Problem: Excel Sheet Column Title (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-01 09:25:07 UTC
 * Runtime: 0 ms
 * Memory: 40.9 MB
 */

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber>0){
            // System.out.println(columnNumber);
            int c = columnNumber%26;
            if (c==0){
                columnNumber--;
                c = 26;
            }
            sb.insert(0,(char)(c+64));
            columnNumber/=26;
        } return sb.toString();
    }
}
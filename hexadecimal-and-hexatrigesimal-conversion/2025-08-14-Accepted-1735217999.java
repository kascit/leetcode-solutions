/*
 * Submission: 1735217999
 * Problem: Hexadecimal and Hexatrigesimal Conversion (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-14 17:32:01 UTC
 * Runtime: 1 ms
 * Memory: 41.8 MB
 */

class Solution {
    public String concatHex36(int n) {
        int sq = n*n, cube = n*n*n;
        StringBuilder sb = new StringBuilder();
        while(sq>0){
            char cur = (char)(sq%16 + '0');
            if(cur > '9'){
                cur += -'9' + 'A' - 1;
            }
            sq/=16;
            sb.insert(0,cur);
        }
        int i = sb.length();
        while(cube>0){
            char cur = (char)(cube%36 + '0');
            if(cur > '9'){
                cur += -'9' - 1 + 'A';
            }
            cube/=36;
            sb.insert(i,cur);
        }
        return sb.toString();
    }
}
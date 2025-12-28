/*
 * Submission: 1599125514
 * Problem: Roman to Integer (Easy)
 * Status: Compile Error
 * Language: java
 * Timestamp: 2025-04-07 03:45:47 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> m = Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
        );
        char[] rom = s.toCharArray();
        int res = 0, int cur = 0, int prev = 0;
        for(char ch : rom){
            cur = m.get(ch);
            if(cur > prev) {res += cur;}
            else {res -= cur;}
            int prev = cur;
        }
        return res;
    }
}
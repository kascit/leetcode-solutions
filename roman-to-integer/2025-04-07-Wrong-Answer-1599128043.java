/*
 * Submission: 1599128043
 * Problem: Roman to Integer (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-07 03:49:44 UTC
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
        int res = 0, cur = 0, prev = 0;
        for(char ch : rom){
            cur = m.get(ch);
            if(cur <= prev) {}
            else {res -= prev;}
            res += cur;
            prev = cur;
        }
        return res;
    }
}
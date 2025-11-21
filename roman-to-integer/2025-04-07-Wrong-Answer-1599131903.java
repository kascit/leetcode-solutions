/*
 * Submission: 1599131903
 * Problem: Roman to Integer (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-07 03:55:21 UTC
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
        for(int i = rom.length - 1; i >= 0; i--){
            cur = m.get(rom[i]);
            if(cur < prev){res -= prev;}
            res += cur;
            prev = cur;
            //System.out.print("num" + res);
        }
        return res;
    }
}
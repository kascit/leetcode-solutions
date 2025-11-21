/*
 * Submission: 1608177264
 * Problem: Letter Combinations of a Phone Number (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-16 04:45:47 UTC
 * Runtime: 0 ms
 * Memory: 42.2 MB
 */

class Solution {
    Map<Integer, String> itoa = Map.of(
        2, "abc",
        3, "def",
        4, "ghi",
        5, "jkl",
        6, "mno",
        7, "pqrs",
        8, "tuv",
        9, "wxyz"
    );

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.isEmpty()) return res;
        bt(digits, 0,new StringBuilder(),res);
        return res;
    }

    void bt(String digits, int index, StringBuilder current, List<String> result){
        if(index == digits.length()){
            result.add(current.toString());
            return;
        }
        String letters = itoa.get(digits.charAt(index) - '0');
        for (char ch : letters.toCharArray()){
            current.append(ch);
            bt(digits, index+1,current,result);
            current.deleteCharAt(current.length()-1);
        }
    }
}
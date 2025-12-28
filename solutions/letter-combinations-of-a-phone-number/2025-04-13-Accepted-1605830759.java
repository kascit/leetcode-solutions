/*
 * Submission: 1605830759
 * Problem: Letter Combinations of a Phone Number (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 17:26:27 UTC
 * Runtime: 0 ms
 * Memory: 42.2 MB
 */

class Solution {
    static Map<Integer,String> itoa = new HashMap<>();
        static {
            itoa.put(2, "abc");
            itoa.put(3, "def");
            itoa.put(4, "ghi");
            itoa.put(5, "jkl");
            itoa.put(6, "mno");
            itoa.put(7, "pqrs");
            itoa.put(8, "tuv");
            itoa.put(9, "wxyz");
        }

    public List<String> letterCombinations(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.isEmpty()) return result;
        bt(s, 0,new StringBuilder(), result);
        return result;
    }
    void bt(String digits, int index, StringBuilder current, List<String> result){
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }
        String letters = itoa.get(digits.charAt(index) - '0');
        for (char ch : letters.toCharArray()){
            current.append(ch);
            bt(digits, index+1, current, result);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
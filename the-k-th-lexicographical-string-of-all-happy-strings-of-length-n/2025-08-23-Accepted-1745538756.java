/*
 * Submission: 1745538756
 * Problem: The k-th Lexicographical String of All Happy Strings of Length n (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-23 15:29:02 UTC
 * Runtime: 10 ms
 * Memory: 45.2 MB
 */

class Solution {
    List<String> happies = new ArrayList<>();
    char[] ops = new char[]{'a','b','c'};
    public String getHappyString(int n, int k) {
        bt(n,new StringBuilder(),'0');
        // System.out.println(happies);
        return (k <= happies.size()) ? happies.get(k-1) : "";
    }

    private void bt(int len, StringBuilder curr, char cantTake) {

        // System.out.println(curr);
        if (len == 0) {
            happies.add(curr.toString());
            // if (curr.length() > 0) curr.deleteCharAt(curr.length()-1);
            // curr.setLength(0);
            return;
        }
        for (char ch : ops) {
            if (ch != cantTake) {
                curr.append(ch);
                bt(len-1,curr,ch);
                if (curr.length() > 0) curr.deleteCharAt(curr.length()-1);
            }
        }
        return;
    }
}
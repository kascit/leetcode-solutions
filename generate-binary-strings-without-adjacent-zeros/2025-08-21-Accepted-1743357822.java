/*
 * Submission: 1743357822
 * Problem: Generate Binary Strings Without Adjacent Zeros (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 15:26:58 UTC
 * Runtime: 1 ms
 * Memory: 46.2 MB
 */

class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> validStrings(int n) {
        bt(n,new StringBuilder(),true);
        return ans;
    }

    private void bt(int len, StringBuilder cur, boolean canTakeZero) {
        if (len == 0) {
            ans.add(cur.toString());
            // cur.setLength();
            return;
        }
        if (canTakeZero) {
            cur.append('0');
            bt(len-1,cur,false);
            cur.deleteCharAt(cur.length()-1);
        }
        cur.append('1');
        bt(len-1,cur,true);
        cur.deleteCharAt(cur.length()-1);
        return;
    }
}
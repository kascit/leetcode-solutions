/*
 * Submission: 1710437603
 * Problem: Generate Parentheses (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-07-25 04:04:55 UTC
 * Runtime: 1 ms
 * Memory: 43.3 MB
 */

class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ans = new ArrayList<>();
       int opened = 0, closed = 0; 
       bt(ans,n,opened,closed, "");
       return ans;
    }

    public void bt(List<String> ans, int n, int opened, int closed, String cur){
        if (closed == n){
            ans.add(cur);
            return;
        }

        if (opened < n){
            bt(ans,n,opened+1,closed, cur+"(");
        }
        if (closed < opened){
            bt(ans,n,opened,closed+1, cur+")");
        }
        return;

    }
}
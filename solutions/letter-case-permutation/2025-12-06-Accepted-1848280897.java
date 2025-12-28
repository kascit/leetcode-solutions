/*
Submission: 1848280897
Status: Accepted
Timestamp: 2025-12-06 11:43:04 UTC
Runtime: 2 ms
Memory: 47.4 MB
*/

class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        bt(s,ans,new StringBuilder(),0);
        return ans;
    }
    void bt(String s, List<String> l, StringBuilder sb, int idx) {
      if (sb.length() == s.length()) {
        l.add(sb.toString());
        return;
      }
      if (Character.isLetter(s.charAt(idx))) {
        sb.append(Character.toLowerCase(s.charAt(idx)));
        bt(s,l,sb,idx+1);
        sb.setLength(sb.length()-1);

        sb.append(Character.toUpperCase(s.charAt(idx)));
        bt(s,l,sb,idx+1);
        sb.setLength(sb.length()-1);

      } else {
        sb.append(s.charAt(idx));
        bt(s,l,sb,idx+1);
        sb.setLength(sb.length()-1);
      }
    }
}
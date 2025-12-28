/*
Submission: 1841849508
Status: Accepted
Timestamp: 2025-11-28 15:33:44 UTC
Runtime: 2 ms
Memory: 43.3 MB
*/

class Solution {
    Set<String> s;
    int n;
    boolean done = false;
    String ans;

    public String findDifferentBinaryString(String[] nums) {
        this.n = nums.length;
        this.s = new HashSet<>();
        for (String num : nums) {
            s.add(num);
        }
        bt(new StringBuilder());
        return ans;
    }

    void bt(StringBuilder sb) {
        if (done) return;
        if (sb.length() == n) {
            String st = sb.toString();
            if (!s.contains(st)) {
                ans = st;
                done = true;
            }
            return;
        }
        sb.append("0");
        bt(sb);
        sb.deleteCharAt(sb.length() - 1);
        sb.append("1");
        bt(sb);
        sb.deleteCharAt(sb.length() - 1);
    }
        
}
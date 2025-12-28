/*
Submission: 1841850341
Status: Accepted
Timestamp: 2025-11-28 15:35:05 UTC
Runtime: 1 ms
Memory: 43.1 MB
*/

class Solution {
    Set<String> s;
    int n;

    public String findDifferentBinaryString(String[] nums) {
        this.n = nums.length;
        this.s = new HashSet<>();
        for (String num : nums) {
            s.add(num);
        }
        return bt(new StringBuilder());
    }

    String bt(StringBuilder sb) {
        if (sb.length() == n) {
            String st = sb.toString();
            // System.out.println(st);
            if (!s.contains(st)) {
                return st;
            } else {
                return "";
            }
        }
        sb.append("0");
        String ret = bt(sb);
        if (ret.length()==n)
            return ret;
        sb.deleteCharAt(sb.length() - 1);
        sb.append("1");
        ret = bt(sb);
        if (ret.length()==n)
            return ret;
        sb.deleteCharAt(sb.length() - 1);
        return "";
    }
}
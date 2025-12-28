/*
Submission: 1841838191
Status: Runtime Error
Timestamp: 2025-11-28 15:15:14 UTC
Runtime: N/A
Memory: N/A
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
            if (!s.contains(st)) {
                return st;
            } else {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
                return "";
            }
        }
        sb.append("0");
        String ret = bt(sb);
        if (!ret.equals(""))
            return ret;
        if (sb.length() > 0)
            sb.deleteCharAt(sb.length() - 1);
        sb.append("1");
        ret = bt(sb);
        if (!ret.equals(""))
            return ret;
        return "";
    }
}
/*
Submission: 1839595852
Status: Accepted
Timestamp: 2025-11-25 17:06:22 UTC
Runtime: 0 ms
Memory: 43.1 MB
*/

class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int l = nums.length;
        StringBuilder sb = new StringBuilder(l);
        int i = 0;
        for (String s : nums) {
            sb.append((s.charAt(i) == '1') ? '0' : '1');
            i++;
        } return sb.toString();
    }
}
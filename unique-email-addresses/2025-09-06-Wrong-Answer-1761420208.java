/*
 * Submission: 1761420208
 * Problem: Unique Email Addresses (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-06 11:41:40 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (String e : emails) {
            boolean done = false;
            int idx = e.indexOf('+'), len = e.length();
            if (idx == -1) { idx = e.indexOf('@'); done = true;}
            for(int i = 0; i < idx; i++) {
                char cur = e.charAt(i);
                if (cur == '.') continue;
                sb.append(cur);
            }
            if (!done) idx = e.indexOf('@');
            for (int i = idx + 1; i < len; i++) {
                sb.append(e.charAt(i));
            }
            set.add(sb.toString());
            sb.setLength(0);
        } return set.size();
    }
}
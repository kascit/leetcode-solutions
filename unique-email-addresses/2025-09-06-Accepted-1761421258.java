/*
 * Submission: 1761421258
 * Problem: Unique Email Addresses (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-06 11:43:01 UTC
 * Runtime: 9 ms
 * Memory: 44.3 MB
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
            sb.append('@');
            if (!done) idx = e.indexOf('@');
            for (int i = idx + 1; i < len; i++) {
                sb.append(e.charAt(i));
            }
            set.add(sb.toString());
            // System.out.println(sb.toString());
            sb.setLength(0);
        } return set.size();
    }
}
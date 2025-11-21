/*
 * Submission: 1724647261
 * Problem: Sorting the Sentence (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-05 16:43:18 UTC
 * Runtime: 2 ms
 * Memory: 41.8 MB
 */

class Solution {
    public String sortSentence(String s) {
        String[] str = s.split("\\s");
        Arrays.sort(str, (a, b) -> {
            int lastA = Integer.parseInt(a.substring(a.length() - 1));
            int lastB = Integer.parseInt(b.substring(b.length() - 1));
            return Integer.compare(lastA, lastB);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) {
                sb.append(str[i].substring(0, str[i].length() - 1));
            }
            if (i < str.length - 1) sb.append(" ");
        }
        // System.out.println(Arrays.toString(str));
        return sb.toString();
    }
}
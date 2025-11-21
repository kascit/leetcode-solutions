/*
 * Submission: 1744506155
 * Problem: Remove Comments (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-22 15:53:39 UTC
 * Runtime: 1 ms
 * Memory: 42.1 MB
 */

class Solution {
    public List<String> removeComments(String[] source) {
        int len = source.length;
        List<String> ans = new ArrayList<>(len);
        StringBuilder sb = new StringBuilder();
        boolean mult = false;
        boolean end = false;
        for (String s : source) {
            // int idx = -1;
            char prev = '0';
            // boolean single = false;
            for(char cur : s.toCharArray() ) {

                // System.out.println("prev: "+prev+"    cur: "+cur);
                // System.out.println("before:  "+sb.toString());
                if (cur == '/') {
                    if (!mult && prev == '/') {
                        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
                        // single = true;
                        // System.out.println("Why");
                        break;
                    }
                    if (mult && prev == '*') {
                        // if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
                        mult = false;
                        end = true;
                        cur = '0';
                    }
                } else if (!mult && cur == '*') {
                    if (prev == '/') {
                        if (sb.length() > 0) sb.deleteCharAt(sb.length() - 1);
                        mult = true;
                        cur = '0';
                    }
                }
                // System.out.println("after:  "+sb.toString());
                if (!mult && !end) {
                    sb.append(cur);
                }
                end = false;
                prev = cur;
            }
            if (sb.length() > 0 && !mult){
                ans.add(sb.toString());
                sb.setLength(0);
            }
        }
        return ans;
    }
}


                // if (idx >= 0) {
                //     if (!mult) {
                //         if (ch == '/' && sb.charAt(idx) == '/') {
                //             sb.setLength(idx--);
                //             break;
                //         }
                //         if (ch == '*' && sb.charAt(idx) == '/') {
                //             sb.setLength(idx--);
                //             mult = true;
                //         }
                //     }
                //     else if (ch == '/' && sb.charAt(idx) == '*') {
                //         System.out.println(idx);
                //         sb.setLength(idx--);
                //         mult = false;
                //     }

                // }
                // if (!mult) {
                //     sb.append(ch);
                //     idx++;
                // }
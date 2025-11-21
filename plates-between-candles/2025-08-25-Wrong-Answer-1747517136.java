/*
 * Submission: 1747517136
 * Problem: Plates Between Candles (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-25 08:48:47 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int[] platesTill = new int[len];
        int[] candles = new int[len];
        int cur = 0, idx = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == '*') cur++;
            else {
                candles[idx++] = i;
            }
            platesTill[i] = cur;
        }
        // System.out.println(Arrays.toString(candles));
        // System.out.println(Arrays.toString(platesTill));

        int[] ans = new int[queries.length];
        int a = 0;
        for (int[] query : queries) {
            int start = query[0];
            int end = query[1];
            int l = 0, r = idx-1;
            int rs = -1, re = -1;
            while(l <= r) {
                int mid = l + (r-l)/2;
                int curr = candles[mid];
                // System.out.println(curr);
                if ( curr == start) {
                    rs = curr; 
                    break; 
                }
                else if (cur < start) {
                    l = mid + 1;
                } else {
                    rs = curr;
                    r = mid - 1;
                }
            }
            l = 0; r = idx - 1;
                // System.out.println("rs");

            while(l <= r) {
                int mid = l + (r-l)/2;
                int curr = candles[mid];
                // System.out.println(curr);
                if ( curr == end) {
                    re = curr; 
                    break; 
                }
                else if (curr < end) {
                    re = curr;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
                // System.out.println(re+"    "+rs);
            if (re == -1 || re > end || rs < start || rs == -1) {
                ans[a++] = 0;
            } else
            ans[a++] = platesTill[re] - platesTill[rs];
        }
        return ans;
    }
}
/*
 * Submission: 1731046394
 * Problem: Range Product Queries of Powers (Medium)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-11 09:36:11 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int[] ans = new int[queries.length];
        Stack<Integer> st = new Stack<>();
        while (n > 0) {
            int pow = log2(n);
            int cur = (int) Math.pow(2, pow);
            n -= cur;
            st.push(cur);
        }
        int[] range = new int[st.size()];
        int j = 0;
        while (!st.isEmpty()) {
            range[j++] = st.pop();
        }
        long[] prefMul = new long[range.length];
        long mul = 1;
        for (int i = 0; i < range.length; i++) {
            mul *= range[i];
            prefMul[i] = mul;
        }
        // System.out.println(Arrays.toString(range));
        // System.out.println(Arrays.toString(prefMul));
        int i = 0;
        for (int[] q : queries) {
            ans[i++] = (int) (((prefMul[q[1]] / prefMul[q[0]]) * range[q[0]]) % (1e9 + 7));
        }
        return ans;
    }

    private int log2(int n) {
        return 31 - Integer.numberOfLeadingZeros(n);
    }
}
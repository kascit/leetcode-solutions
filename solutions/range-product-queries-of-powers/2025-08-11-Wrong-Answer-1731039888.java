/*
 * Submission: 1731039888
 * Problem: Range Product Queries of Powers (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-11 09:29:02 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int[] ans = new int[queries.length];
        Stack<Integer> st = new Stack<>();
        while(n>0){
            int pow = log2(n);
            int cur = (int)Math.pow(2,pow);
            n -= cur;
            st.push(cur);
        }
        int[] range = new int[st.size()];
        int j = 0;
        while(!st.isEmpty()){
            range[j++] = st.pop();
        }
        int[] prefMul = new int[range.length];
        int mul = 1;
        for (int i = 0; i < range.length; i++){
            mul *= range[i];
            prefMul[i] = mul;
        }
        int i = 0;
        for (int[] q: queries){
            ans[i++] = (prefMul[q[1]]/prefMul[q[0]])*range[q[0]];
        }
        return ans;
    }
    private int log2(int n) {
        return 31 - Integer.numberOfLeadingZeros(n);
    }
}
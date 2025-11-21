/*
 * Submission: 1743473374
 * Problem: Construct Smallest Number From DI String (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 17:07:48 UTC
 * Runtime: 1 ms
 * Memory: 41.5 MB
 */

class Solution {
    public String smallestNumber(String s) {
        int i = 1;
        int idx = 0;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[s.length()+1];
        for(char c : s.toCharArray()){
            if (c == 'I') {
                ans[idx++] = i++;
                while(!st.isEmpty()){
                    ans[idx++] = st.pop();
                }
            }
            else {
                st.push(i++);
            }
        }
        ans[idx++] = i;
        while(!st.isEmpty()){
            ans[idx++] = st.pop();
        }
        StringBuilder sb = new StringBuilder();
        for (int it : ans){
            sb.append(it);
        }
        return sb.toString();
    }
}
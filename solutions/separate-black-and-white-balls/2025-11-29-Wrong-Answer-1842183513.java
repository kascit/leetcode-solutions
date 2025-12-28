/*
Submission: 1842183513
Status: Wrong Answer
Timestamp: 2025-11-29 04:24:51 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public long minimumSteps(String s) {
        long swaps = 0;
        char[] arc = s.toCharArray();
        int len = arc.length;
        for (int i = 0; i < len - 1; i++) {
            if (arc[i] == '0') continue;
            boolean swapped = false;
            for (int j = i + 1; j < len - i; j++) {
                if(arc[j] == '1') continue;
                swaps++;
                char temp = arc[j];
                arc[j] = arc[j-1];
                arc[j-1] = temp;
            }
        } return swaps;
    }
}
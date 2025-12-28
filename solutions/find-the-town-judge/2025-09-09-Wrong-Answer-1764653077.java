/*
 * Submission: 1764653077
 * Problem: Find the Town Judge (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-09-09 07:08:43 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean[] notJudge = new boolean[n+1];
        int[] trustJudge = new int[n+1];
        for (int[] i : trust) {
            notJudge[i[0]] = true; 
            trustJudge[i[1]]++;
        }
        // System.out.println(Arrays.toString(notJudge));
        // System.out.println(Arrays.toString(trustJudge));
        int JudgeCandidate = -1;
        boolean first = false;
        for (int i = 1; i <= n; i++) {
            if(notJudge[i] == false) {
                if (first) return -1;
                first = true;
                JudgeCandidate = i;
            }
        }
        return JudgeCandidate;
    }
}
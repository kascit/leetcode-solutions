/*
 * Submission: 1764654049
 * Problem: Find the Town Judge (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-09 07:09:57 UTC
 * Runtime: 2 ms
 * Memory: 53.7 MB
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
        if (JudgeCandidate == -1) return -1;
        return (trustJudge[JudgeCandidate] == n-1) ? JudgeCandidate : -1;
    }
}
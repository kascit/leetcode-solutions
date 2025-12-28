/*
Submission: 1850206458
Status: Wrong Answer
Timestamp: 2025-12-08 14:12:30 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] matd = new boolean[numCourses][numCourses];
        for (int [] p : prerequisites) {
          matd[p[0]][p[1]] = true;
        }
        for (int i = 0; i < numCourses; i++) {
          for (int j = 0; j < numCourses; j++) {
            for (int intem = 0; intem < numCourses; intem++) {
              if (matd[i][intem] && matd[intem][j]) {
                matd[i][j] = true;
              }
            }
          }
        }
        List<Boolean> ans = new ArrayList<>();
        for (int[] q : queries) {
          ans.add(matd[q[0]][q[1]]);
        } return ans;
    }
}
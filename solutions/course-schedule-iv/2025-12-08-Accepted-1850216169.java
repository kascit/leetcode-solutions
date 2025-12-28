/*
Submission: 1850216169
Status: Accepted
Timestamp: 2025-12-08 14:24:18 UTC
Runtime: 39 ms
Memory: 51.2 MB
*/

class Solution {
  public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
    boolean[][] matd = new boolean[numCourses][numCourses];
    for (int[] p : prerequisites) {
      matd[p[0]][p[1]] = true;
    }

    for (int intem = 0; intem < numCourses; intem++) {
      for (int j = 0; j < numCourses; j++) {
        for (int i = 0; i < numCourses; i++) {
          matd[i][j] |= matd[i][intem] && matd[intem][j];
        }
      }
    }

    List<Boolean> ans = new ArrayList<>();
    for (int[] q : queries) {
      ans.add(matd[q[0]][q[1]]);
    }
    return ans;
  }
}
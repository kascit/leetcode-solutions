/*
 * Submission: 1743513094
 * Problem: Spiral Matrix (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-21 17:38:05 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = m.length - 1, left = 0, right = m[0].length - 1;
        int i = 0, j = 0;
        while(top<=bottom && left<=right){
            while(j<right){
                list.add(m[i][j++]);
            }
            top++;

            while(i<bottom){
                list.add(m[i++][j]);
            }
            right--;

            while(j>left){
                list.add(m[i][j--]);
            }
            bottom--;
            
            while(i>top){
                list.add(m[i--][j]);
            }
            left++;
        }
        int a = m.length, b = m[0].length;
        if ((a&1) == 1 && (b&1) == 1) list.add(m[a/2][b/2]);
        return list;
    }
}
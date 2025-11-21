/*
 * Submission: 1743515500
 * Problem: Spiral Matrix (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 17:39:53 UTC
 * Runtime: 0 ms
 * Memory: 41.9 MB
 */

class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = m.length - 1, left = 0, right = m[0].length - 1;
        int i = 0, j = 0;

        while (top <= bottom && left <= right) {
            // go left → right
            while (j <= right) {
                list.add(m[i][j++]);
            }
            j--; i++;
            top++;

            // go top → bottom
            while (i <= bottom) {
                list.add(m[i++][j]);
            }
            i--; j--;
            right--;

            // go right → left
            if (top <= bottom) {
                while (j >= left) {
                    list.add(m[i][j--]);
                }
                j++; i--;
                bottom--;
            }

            // go bottom → top
            if (left <= right) {
                while (i >= top) {
                    list.add(m[i--][j]);
                }
                i++; j++;
                left++;
            }
        }
        return list;
    }
}

/*
 * Submission: 1730218440
 * Problem: Flipping an Image (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-10 14:40:54 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            boolean isOdd = false;
            for (int j = 0; j < (image[i].length) / 2; j++) {
                if ((image[i].length&1) == 1) isOdd = true;
                // for (int it = 0; it < image.length; it++) {
                //     for (int jt = 0; jt < (image[i].length); jt++) {
                //         System.out.print(image[it][jt]);
                //     }
                //     System.out.println();
                // }
                // System.out.println();

                int TEMP = image[i][j];
                image[i][j] = (image[i][image[i].length - 1 - j] == 0) ? 1 : 0;
                image[i][image[i].length - 1 - j] = (TEMP == 0) ? 1 : 0;
            }
            if (isOdd) image[i][(image[i].length)/2] ^= 1;
        }
        return image;
    }
}
/*
 * Submission: 1757744020
 * Problem: Minimum Index Sum of Two Lists (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 03:46:28 UTC
 * Runtime: 39 ms
 * Memory: 45.5 MB
 */

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int k = Integer.MAX_VALUE, idx = 0, len = list1.length, ben = list2.length;
        String[] ans = new String[len];

        for (int i = 0; i < len; i++) {
            String cur = list1[i];
            for (int j = 0; j < ben && i + j <= k; j++) {
                    // System.out.println(cur);
                if (list2[j].equals(cur)) {
                    if (i+j < k) {
                        idx = 0;
                        k = i + j;
                    }
                    ans[idx++] = cur;
                }
            }
        } //System.out.println(Arrays.toString(ans));
        return Arrays.copyOfRange(ans,0,idx);
    }
}
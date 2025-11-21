/*
 * Submission: 1762834841
 * Problem: Element Appearing More Than 25% In Sorted Array (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 15:59:04 UTC
 * Runtime: 1 ms
 * Memory: 45 MB
 */

class Solution {
    public int findSpecialInteger(int[] arr) {
        int len = arr.length;
        int c = 1;
        if (len >= 4) {
            c += len/4;
        }
        int rc = 1;
        if (rc == c) return arr[0];
        for (int i = 0; i < len - 1; i++) {
            // System.out.println(c+"  "+rc + "  i:"+i);
            if (rc == c) return arr[i];
            if (arr[i] == arr[i+1]) {
                rc++;
            } else rc = 1; 
        } return (rc==c) ? arr[len-1] : -1;
    }
}
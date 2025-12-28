/*
 * Submission: 1754985676
 * Problem: First Bad Version (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 16:44:24 UTC
 * Runtime: 26 ms
 * Memory: 40.9 MB
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l<r) {
            int mid = l + (r-l)/2;
            if (isBadVersion(mid)) {
                r = mid;
            } else l = mid + 1;
        } return l;
    }
}
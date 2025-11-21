/*
 * Submission: 1754983526
 * Problem: First Bad Version (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-31 16:42:31 UTC
 * Runtime: 26 ms
 * Memory: 40.5 MB
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1, r = n, ans = 0;
        while (l<=r) {
            int mid = l + (r-l)/2;
            if (isBadVersion(mid)) {
                ans = mid;
                r = mid - 1;
            } else l = mid + 1;
        } return ans;
    }
}
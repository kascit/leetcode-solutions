/*
Submission: 1846552652
Status: Accepted
Timestamp: 2025-12-04 06:58:59 UTC
Runtime: 16 ms
Memory: 73.9 MB
*/

class Solution {
    int[] N;
    int n;

    public long maxRunTime(int n, int[] batteries) {
        this.n = n;
        this.N = batteries;

        long sum = 0;
        for (int b : batteries) sum += b;

        long l = 1;
        long r = sum / n;
        long ans = 0;

        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (isValid(mid)) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    boolean isValid(long r) {
        long need = r * n;
        long could = 0;
        for (int c : N) {
            could += Math.min(c, r);
            if (could >= need) return true;
        }
        return could >= need;
    }
}

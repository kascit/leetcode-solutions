/*
Submission: 1838711769
Status: Wrong Answer
Timestamp: 2025-11-24 17:05:47 UTC
Runtime: N/A
Memory: N/A
*/

class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int chair = 0;
        int[] frn = times[targetFriend];
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0, j = 0; i < times.length;) {
            if (Arrays.equals(frn,times[i])) return chair;
            if(times[i][0] < times[j][1]) {
                i++;
                chair++;
            } else {
                j++;
                chair--;
            }
        } return -1;
    }
}
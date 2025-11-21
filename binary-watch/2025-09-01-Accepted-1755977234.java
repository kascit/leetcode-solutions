/*
 * Submission: 1755977234
 * Problem: Binary Watch (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-01 15:14:52 UTC
 * Runtime: 20 ms
 * Memory: 45.3 MB
 */

class Solution {
    private Set<String> ans = new HashSet<>();
    private int[] mins = new int[]{1,2,4,8,16,32}, hours = new int[]{1,2,4,8};
    public List<String> readBinaryWatch(int turnedOn) {
        doit(turnedOn,0,0,0,0);
        return new ArrayList(ans);
    }
    private void doit(int count, int hour, int min, int hidx, int midx) {
        if (count == 0) {
            StringBuilder sb = new StringBuilder().append(hour).append(":");
            if (min < 10) {
                sb.append(0);
            } sb.append(min);
            ans.add(sb.toString());
            return;
        }
        if (hidx < 4) {
            doit(count,hour,min,hidx+1,midx);
            if (hour+hours[hidx] < 12) {
                doit(count-1,hour+hours[hidx],min,hidx+1,midx);
            }
        }
        if (midx < 6) {
            doit(count,hour,min,hidx,midx+1);
            if (min+mins[midx] <= 59) {
                doit(count-1,hour,min+mins[midx],hidx,midx+1);
            }
        }
            
    }
}
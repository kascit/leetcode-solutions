/*
 * Submission: 1755976760
 * Problem: Binary Watch (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-01 15:14:26 UTC
 * Runtime: 0 ms
 * Memory: 42.3 MB
 */

class Solution {
    private Set<String> ans = new HashSet<>();
    private int[] mins = new int[]{1,2,4,8,16,32}, hours = new int[]{1,2,4,8};
    public List<String> readBinaryWatch(int turnedOn) {
        doit(turnedOn,0,0,0);
        return new ArrayList(ans);
    }
    private void doit(int count, int hour, int min, int idx) {
        if (count == 0) {
            StringBuilder sb = new StringBuilder().append(hour).append(":");
            if (min < 10) {
                sb.append(0);
            }
            sb.append(min);
            ans.add(sb.toString());
            return;
        }
        if (idx < 10) {
            doit(count,hour,min,idx+1);
            if (idx < 4) {
                if (hour+hours[idx] < 12) {
                    doit(count-1,hour+hours[idx],min,idx+1);
                }
            } else {
                int midx = idx-4;
                if (min+mins[midx] <= 59) {
                    doit(count-1,hour,min+mins[midx],idx+1);
                }
            }
        }
    }
}

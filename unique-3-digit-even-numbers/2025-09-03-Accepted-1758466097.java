/*
 * Submission: 1758466097
 * Problem: Unique 3-Digit Even Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 17:03:12 UTC
 * Runtime: 6 ms
 * Memory: 44.3 MB
 */

class Solution {
    int ans = 0;
    int[] digits;
    Set<Integer> set;
    public int totalNumbers(int[] digits) {
        this.digits = digits;
        set = new HashSet<>();
        // this.picked = 
        bt(0,new boolean[digits.length]);
        return ans;
    }
    private void bt(int num, boolean[] picked) {
        // boolean[] picked = ;;
        if (set.contains(num)) return;
        if (num >= 100) {
            if ((num&1) == 0 && num < 1000 ) {
                set.add(num);
                ans++;
            }
            return;
        }
        set.add(num);
        for (int i = 0; i < digits.length; i++) {
            if ((picked[i]) || (digits[i] == 0 && num == 0) || ( (digits[i]&1)==1 && num >= 10) || (set.contains(num*10+digits[i]))) continue;
            picked[i] = true;
            bt(num*10+digits[i],picked);
            picked[i] = false;
        }
    }
}
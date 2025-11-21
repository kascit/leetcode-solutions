/*
 * Submission: 1758452794
 * Problem: Unique 3-Digit Even Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 16:52:32 UTC
 * Runtime: 434 ms
 * Memory: 44.4 MB
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
        if (num >= 100  && num < 1000 && (num&1) == 0 && !set.contains(num)) {
            set.add(num);
            ans++;
            return;
        }
        for (int i = 0; i < digits.length; i++) {
            if ((picked[i]) || (digits[i] == 0 && num == 0) || ( (digits[i]&1)==1 && num >= 10)) continue;
            picked[i] = true;
            bt(num*10+digits[i],picked);
            picked[i] = false;
        }
    }
}
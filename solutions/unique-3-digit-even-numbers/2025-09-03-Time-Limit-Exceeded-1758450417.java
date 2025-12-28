/*
 * Submission: 1758450417
 * Problem: Unique 3-Digit Even Numbers (Easy)
 * Status: Time Limit Exceeded
 * Language: java
 * Timestamp: 2025-09-03 16:50:35 UTC
 * Runtime: N/A
 * Memory: N/A
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
            if (picked[i]) continue;
            picked[i] = true;
            bt(num*10+digits[i],picked);
            picked[i] = false;
        }
    }
}
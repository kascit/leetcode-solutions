/*
 * Submission: 1758459009
 * Problem: Unique 3-Digit Even Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 16:57:32 UTC
 * Runtime: 6 ms
 * Memory: 44.6 MB
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
        if (num >= 100  && num < 1000 && (num&1) == 0) {
            set.add(num);
            ans++;
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
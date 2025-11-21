/*
 * Submission: 1722035035
 * Problem: Self Dividing Numbers (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-03 15:25:30 UTC
 * Runtime: 1 ms
 * Memory: 41.3 MB
 */

class Solution {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> selfDividingNumbers(int left, int right) {
        for (int i = left; i <= right; i++){
            izzy(i);
        }
        return ans;
    }
    void izzy(int i){
        if (i < 10) {ans.add(i); return;}
        int TEMP = i;
        while (TEMP > 0){
            int cur = TEMP%10;
            if (cur == 0) return;
            if (i%cur !=  0) return;
            TEMP /= 10;
        } ans.add(i); return;

    }
}
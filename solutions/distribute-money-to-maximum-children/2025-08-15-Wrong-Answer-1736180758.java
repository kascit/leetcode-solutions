/*
 * Submission: 1736180758
 * Problem: Distribute Money to Maximum Children (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-15 13:58:04 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class Solution {
    public int distMoney(int money, int children) {
        if (money < children) return -1;
        int cnt = 0, ratio = money/children;
        if( ratio >= 8){
            if(money == children*8) return money/8;
            return children-1;
        }
        money -= children;
        return money/7 - ((money%7 == 3) ? 1 : 0);
    }
}
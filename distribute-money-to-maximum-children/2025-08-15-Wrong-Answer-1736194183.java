/*
 * Submission: 1736194183
 * Problem: Distribute Money to Maximum Children (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-15 14:09:41 UTC
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
        System.out.println(money);
        if (money < 7) return cnt;
        while(money>=7){
            money-=7;
            cnt++;
        }
        if (money == 3) cnt--;
        return cnt;
    }
}
/*
 * Submission: 1819648179
 * Problem: Minimum Time to Make Rope Colorful (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-03 14:55:45 UTC
 * Runtime: 26 ms
 * Memory: 91.5 MB
 */

class Solution {
    public int minCost(String colors, int[] neededTime) {
        // Stack<Character> color = new Stack<>();
        Stack<Integer> time = new Stack<>();
        int ans = 0;
        int n = neededTime.length;
        // color.push(colors.charAt(0));
        time.push(neededTime[0] + (colors.charAt(0)-'a'+1)*100000);
        for (int i = 1; i < n; i++) {
            int curC = (colors.charAt(i)-'a'+1);
            int curT = neededTime[i];
            int prev = time.peek();
            int prevT = prev%100000;
            int prevC = prev/100000;
            // System.out.println(prevC+"   "+curC);
            if (curC != prevC) {
                time.push(curC*100000+curT);
            } else {
                if (prevT > curT) {
                    ans+= curT;
                } else {
                    ans+= prevT;
                    time.pop();
                    time.push(curC*100000+curT);
                }
            }
        }

        return ans;

    }
}
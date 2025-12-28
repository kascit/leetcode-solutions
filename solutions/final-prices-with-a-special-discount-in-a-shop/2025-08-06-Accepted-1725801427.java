/*
 * Submission: 1725801427
 * Problem: Final Prices With a Special Discount in a Shop (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-06 15:13:13 UTC
 * Runtime: 4 ms
 * Memory: 43.8 MB
 */

class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> nextSmallest = new Stack<>();
        int n = prices.length;
        for (int i = n - 1; i >= 0; i--){
            int discount = 0;
            while(!nextSmallest.isEmpty() && nextSmallest.peek() > prices[i]){
                nextSmallest.pop();
            }
            if (!nextSmallest.isEmpty()) discount = nextSmallest.peek();
            nextSmallest.push(prices[i]);
            prices[i] -= discount;
        } return prices;
    }
}
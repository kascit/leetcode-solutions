/*
 * Submission: 1605744039
 * Problem: Online Stock Span (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-04-13 15:43:13 UTC
 * Runtime: 25 ms
 * Memory: 55.7 MB
 */

class StockSpanner {
    
    Deque<int[]> stack = new ArrayDeque<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && stack.peekLast()[0] <= price){
            int[] cur = stack.pollLast();
            span += cur[1];
        }
        stack.offerLast(new int[]{price,span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
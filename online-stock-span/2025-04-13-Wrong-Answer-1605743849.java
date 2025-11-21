/*
 * Submission: 1605743849
 * Problem: Online Stock Span (Medium)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-04-13 15:42:57 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class StockSpanner {
    
    Deque<int[]> stack = new ArrayDeque<>();
    public StockSpanner() {
        
    }
    
    public int next(int price) {
        int span = 1;
        while(!stack.isEmpty() && stack.peekLast()[0] < price){
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
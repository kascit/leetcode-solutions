/*
 * Submission: 1739974803
 * Problem: Implement Stack using Queues (Easy)
 * Status: Wrong Answer
 * Language: java
 * Timestamp: 2025-08-18 18:03:28 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList();
    }
    
    public void push(int x) {
        pushh(x,x);
    }

    private void pushh(int x, int y){
        if (q.isEmpty()) {
            q.offer(y);
            return;
        }
        int cur = q.poll();
        pushh(cur,y);
        q.offer(cur);
        return;

    } 

    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */


/*
 * Submission: 1739996461
 * Problem: Implement Queue using Stacks (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-18 18:19:30 UTC
 * Runtime: 0 ms
 * Memory: 41.8 MB
 */

class MyQueue {
    Stack<Integer> st;
    Stack<Integer> st2;
    public MyQueue() {
        st = new Stack<>();
        st2 = new Stack<>();
    }
    public void push(int x) {
        while(!st2.isEmpty()){
            st.push(st2.pop());
        }
        st.push(x);
        while(!st.isEmpty()){
            st2.push(st.pop());
        }
    }
    
    public int pop() {
        return st2.pop();
    }
    
    public int peek() {
        return st2.peek();
    }
    
    public boolean empty() {
        return st2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
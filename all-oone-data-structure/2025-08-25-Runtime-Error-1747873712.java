/*
 * Submission: 1747873712
 * Problem: All O`one Data Structure (Hard)
 * Status: Runtime Error
 * Language: java
 * Timestamp: 2025-08-25 15:11:13 UTC
 * Runtime: N/A
 * Memory: N/A
 */

class AllOne {
    Node head;
    Node tail;
    Map<String,Node> mappy;

    public AllOne() {
        mappy = new HashMap<>();
        head = new Node(-1);        
        tail = new Node(-1); 
        head.next = tail;
        tail.prev = head;    
    }
    
    public void inc(String key) {
        if (!mappy.containsKey(key)) {
            if (head.next.freq == 1) {
                head.next.addKey(key);
            } else {
                Node newNode = new Node(1);
                newNode.addKey(key);
                insertAfter(head,newNode);
            }
            mappy.put(key,head.next);
        } else {
            Node cur = mappy.get(key);
            if (cur.freq + 1 == cur.next.freq) {
                cur.removeKey(key);
                cur.next.addKey(key);
            } else {
                Node newN = new Node(cur.freq+1);
                insertAfter(cur,newN);
                newN.addKey(key);
            }
            mappy.put(key,cur.next);
        }
    }
    
    public void dec(String key) {
        if (!mappy.containsKey(key)) return;
        Node cur = mappy.get(key);
        if (cur.freq == 1) {
            cur.removeKey(key);
            if (cur.keys.size() == 0) {
                removeNode(cur);
            }
            mappy.remove(key);
        } else if (cur.prev.freq == cur.freq - 1) {
            cur.removeKey(key);
            cur.prev.addKey(key);
            mappy.put(key,cur.prev);
        } else {
            Node newN = new Node(cur.freq-1);
            insertAfter(cur.prev,newN);
            newN.addKey(key);
            mappy.put(key,cur.prev);
        }
        
    }
    
    public String getMaxKey() {
        if (tail.prev == head) return "";
        return tail.prev.keys.stream().findFirst().get();
    }
    
    public String getMinKey() {
        if (head.next == tail) return "";
        return head.next.keys.stream().findFirst().get();
    }

    private void insertAfter(Node after, Node insert) {
        Node next = after.next;
        insert.prev = after;
        after.next = insert;
        insert.next = next;
        next.prev = insert;
    }
    private void removeNode(Node r) {
        Node next = r.next;
        Node prev = r.prev;
        prev.next = r.next;
        next.prev = r.prev;
    }
}

class Node {
    int freq;
    Set<String> keys;
    Node prev;
    Node next;
    Node(int freq){
        prev = null;
        next = null;
        this.freq = freq;
        keys = new HashSet<>();
    }
    public void addKey(String key){
        this.keys.add(key);
    }
    public void removeKey(String key){
        this.keys.remove(key);
    }
}

/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
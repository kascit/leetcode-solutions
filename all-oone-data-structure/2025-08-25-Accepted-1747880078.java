/*
 * Submission: 1747880078
 * Problem: All O`one Data Structure (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 15:17:01 UTC
 * Runtime: 75 ms
 * Memory: 64.4 MB
 */

class AllOne {
    Node head;
    Node tail;
    Map<String, Node> mappy;

    public AllOne() {
        mappy = new HashMap<>();
        head = new Node(-1);        
        tail = new Node(-1); 
        head.next = tail;
        tail.prev = head;    
    }
    
    public void inc(String key) {
        if (!mappy.containsKey(key)) {
            Node target;
            if (head.next.freq == 1) {
                head.next.addKey(key);
                target = head.next;
            } else {
                Node newNode = new Node(1);
                newNode.addKey(key);
                insertAfter(head, newNode);
                target = newNode;
            }
            mappy.put(key, target);
        } else {
            Node cur = mappy.get(key);
            cur.removeKey(key);
            Node nextNode;
            if (cur.next.freq == cur.freq + 1) {
                nextNode = cur.next;
                nextNode.addKey(key);
            } else {
                nextNode = new Node(cur.freq + 1);
                nextNode.addKey(key);
                insertAfter(cur, nextNode);
            }
            mappy.put(key, nextNode);
            if (cur.keys.isEmpty()) removeNode(cur);
        }
    }
    
    public void dec(String key) {
        if (!mappy.containsKey(key)) return;
        Node cur = mappy.get(key);
        cur.removeKey(key);
        if (cur.freq == 1) {
            mappy.remove(key);
        } else {
            Node prevNode;
            if (cur.prev.freq == cur.freq - 1) {
                prevNode = cur.prev;
                prevNode.addKey(key);
            } else {
                prevNode = new Node(cur.freq - 1);
                prevNode.addKey(key);
                insertAfter(cur.prev, prevNode);
            }
            mappy.put(key, prevNode);
        }
        if (cur.keys.isEmpty()) removeNode(cur);
    }
    
    public String getMaxKey() {
        Node node = tail.prev;
        while (node != head && node.keys.isEmpty()) node = node.prev;
        return node == head ? "" : node.keys.iterator().next();
    }
    
    public String getMinKey() {
        Node node = head.next;
        while (node != tail && node.keys.isEmpty()) node = node.next;
        return node == tail ? "" : node.keys.iterator().next();
    }

    private void insertAfter(Node after, Node insert) {
        Node next = after.next;
        insert.prev = after;
        insert.next = next;
        after.next = insert;
        next.prev = insert;
    }

    private void removeNode(Node r) {
        r.prev.next = r.next;
        r.next.prev = r.prev;
    }
}

class Node {
    int freq;
    Set<String> keys;
    Node prev;
    Node next;
    Node(int freq) {
        this.freq = freq;
        keys = new HashSet<>();
    }
    public void addKey(String key) {
        keys.add(key);
    }
    public void removeKey(String key) {
        keys.remove(key);
    }
}

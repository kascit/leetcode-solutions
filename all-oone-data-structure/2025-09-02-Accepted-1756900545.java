/*
 * Submission: 1756900545
 * Problem: All O`one Data Structure (Hard)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-02 10:20:46 UTC
 * Runtime: 81 ms
 * Memory: 64.3 MB
 */

class AllOne {
    private final Map<String, Node> mappy;
    private final Node head;
    private final Node tail;

    public AllOne() {
        mappy = new HashMap<>();
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    private void insertAfter(Node base, Node ins) {
        Node n = base.next;
        base.next = ins;
        ins.prev = base;
        ins.next = n;
        n.prev = ins;
    }

    private void removeNode(Node t) {
        t.prev.next = t.next;
        t.next.prev = t.prev;
    }

    public void inc(String key) {
        if (!mappy.containsKey(key)) {
            if (head.next.freq == 1) {
                Node cur = head.next;
                cur.keys.add(key);
                mappy.put(key,cur);
            } else {
                Node cur = new Node(1);
                cur.keys.add(key);
                insertAfter(head,cur);
                mappy.put(key,cur);
            }
        } else {
            Node cur = mappy.get(key);
            cur.keys.remove(key);
            if (cur.next.freq == cur.freq+1) {
                Node mew = cur.next;
                mew.keys.add(key);
                mappy.put(key,mew);
            } else {
                Node mew = new Node(cur.freq+1);
                mew.keys.add(key);
                insertAfter(cur,mew);
                mappy.put(key,mew);
            }
            if(cur.keys.isEmpty()) removeNode(cur);
        }
    }
    
    public void dec(String key) {
        Node cur = mappy.get(key);
        cur.keys.remove(key);
        if (cur.freq != 1) {
            if (cur.prev.freq + 1 == cur.freq) {
                Node n = cur.prev;
                n.keys.add(key);
                mappy.put(key,n);
            } else {
                Node n = new Node(cur.freq-1);
                n.keys.add(key);
                insertAfter(cur.prev,n);
                mappy.put(key,n);
            }
        } else {
            mappy.remove(key);
        }

        if(cur.keys.size() == 0) {
            removeNode(cur);
        }
    }

    public String getMaxKey() {
        return tail.prev == head ? "" : tail.prev.keys.iterator().next();
    }

    public String getMinKey() {
        return head.next == tail ? "" : head.next.keys.iterator().next();
    }
}

class Node {
    Node prev, next;
    int freq;
    Set<String> keys;

    Node(int f) {
        this.freq = f;
        this.keys = new HashSet<>();
    }
}


   
    // public void inc(String key) {
    //     if (!mappy.containsKey(key)) {
    //         if (head.next.freq == 1) {
    //             Node cur = head.next;
    //             cur.keys.add(key);
    //             mappy.put(key,cur);
    //         } else {
    //             Node cur = new Node(1);
    //             cur.keys.add(key);
    //             insertAfter(head,cur);
    //             mappy.put(key,cur);
    //         }
    //     } else {
    //         Node cur = mappy.get(key);
    //         cur.keys.remove(key);
    //         if(cur.keys.isEmpty()) removeNode(cur);
    //         if (cur.next.freq == cur.freq+1) {
    //             Node mew = cur.next;
    //             mew.keys.add(key);
    //             mappy.put(key,mew);
    //         } else {
    //             Node mew = new Node(cur.freq+1);
    //             mew.keys.add(key);
    //             insertAfter(cur,mew);
    //             mappy.put(key,mew);
    //         }
    //     }
    // }
    
    // public void dec(String key) {
    //     Node cur = mappy.get(key);
    //     cur.keys.remove(key);
    //     if (cur.freq != 1) {
    //         if (cur.prev.freq + 1 == cur.freq) {
    //             Node n = cur.prev;
    //             n.keys.add(key);
    //             mappy.put(key,n);
    //         } else {
    //             Node n = new Node(cur.freq-1);
    //             n.keys.add(key);
    //             insertAfter(cur.prev,n);
    //             mappy.put(key,n);
    //         }
    //     } else {
    //         mappy.remove(key);
    //     }

    //     if(cur.keys.size() == 0) {
    //         removeNode(cur);
    //     }
    // }


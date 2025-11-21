/*
 * Submission: 1801467091
 * Problem: LRU Cache (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-10-14 14:39:02 UTC
 * Runtime: 42 ms
 * Memory: 111.5 MB
 */

class LRUCache {

    Node head, tail;
    Map<Integer,Node> cache;
    int cap;

    public LRUCache(int capacity) {
        head = null;
        tail = null;
        cap = capacity;
        cache = new HashMap<>();    
    }
    
    public int get(int key) {
        Node got = cache.getOrDefault(key,null);
        if (got == null) return -1;
        use(got);
        return got.val;
    }
    
    public void put(int key, int value) {
        
        Node got = cache.getOrDefault(key,null);
        if (got == null) {
            got = new Node(key,value);
            cache.put(key,got);
        } else {
            got.val = value;
        }
        use(got);
        // System.out.println(key+"    "+value);
        if (cache.size()>cap) {
            cache.remove(head.key);
            head = head.right;
        }
        // System.out.println(cache.size());


    }

    private void use(Node dub) {
        if (tail == dub) return;

        if (dub.right != null) dub.right.left = dub.left;
        if (dub.left != null) dub.left.right = dub.right;

        if (head == dub) head = dub.right;

        dub.left = tail;
        if (tail != null) tail.right = dub;
        tail = dub;
        tail.right = null;

        if (head == null) head = dub;
    }

}

class Node {
    int key;
    int val;
    Node left, right;
    Node(int key, int val){
        this.key = key;
        this.val = val;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
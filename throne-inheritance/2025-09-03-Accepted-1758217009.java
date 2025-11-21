/*
 * Submission: 1758217009
 * Problem: Throne Inheritance (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-03 13:05:01 UTC
 * Runtime: 243 ms
 * Memory: 103.3 MB
 */

class ThroneInheritance {
    Node k;
    Map<String,Node> mappy;

    public ThroneInheritance(String kingName) {
        k = new Node(kingName);
        mappy = new HashMap<>();
        mappy.put(kingName,k);
    }
    
    public void birth(String parentName, String childName) {
        Node c = new Node(childName);
        mappy.get(parentName).children.add(c);
        mappy.put(childName,c);
    }
    
    public void death(String name) {
        // if (mappy.get(name) == k) {
        //     k = k.children.get(0);
        // }
        mappy.remove(name);
        
    }
    
    public List<String> getInheritanceOrder() {
        // Queue<Node> q = new LinkedList<>();
        List<String> list = new ArrayList<>();
        // q.offer(k);
        // while(!q.isEmpty()) {
        //     int size = q.size();
        //     for (int i = 0; i < size; i++) {
        //         Node cur = q.poll();
        //         list.add(cur.name);
        //         for (Node child : cur.children) {
        //             q.offer(child);
        //         }
        //     }
        // } return list;
        // read the fucking question next time
        doi(list,k);
        return list;
    }
    private void doi(List<String> cur, Node r) {
        if (mappy.containsKey(r.name)) cur.add(r.name);
        for (Node c : r.children) {
            doi(cur,c);
        }

    }
}

class Node {
    String name;
    List<Node> children;
    Node (String name) {
        this.name = name;
        children = new ArrayList<>();
    }
}

/**
 * Your ThroneInheritance object will be instantiated and called as such:
 * ThroneInheritance obj = new ThroneInheritance(kingName);
 * obj.birth(parentName,childName);
 * obj.death(name);
 * List<String> param_3 = obj.getInheritanceOrder();
 */
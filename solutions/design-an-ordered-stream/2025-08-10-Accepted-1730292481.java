/*
 * Submission: 1730292481
 * Problem: Design an Ordered Stream (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-10 15:58:50 UTC
 * Runtime: 82 ms
 * Memory: 46 MB
 */

class OrderedStream {
    Map<Integer,String> trm = new HashMap();
    int cap;
    int start;
    public OrderedStream(int n) {
        cap = n;
        start = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> cur = new ArrayList();
        trm.put(idKey,value);
        while(trm.get(start) != null){
            cur.add(trm.get(start));
            start++;
        }
        return cur;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
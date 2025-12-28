/*
 * Submission: 1762370711
 * Problem: Design HashMap (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-09-07 07:08:30 UTC
 * Runtime: 16 ms
 * Memory: 48.4 MB
 */

class MyHashMap extends HashMap<Integer,Integer>{
    
    public int get(int key) {
        Integer k = super.get(key);
        return (k != null) ? k : -1;
    }
    
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
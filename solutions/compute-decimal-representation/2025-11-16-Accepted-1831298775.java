/*
 * Submission: 1831298775
 * Problem: Compute Decimal Representation (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 12:12:08 UTC
 * Runtime: 6 ms
 * Memory: 44.6 MB
 */

class Solution {
    public int[] decimalRepresentation(int n) {
        List<Integer> a= new ArrayList<>();
        int mul = 1;
        while(n > 0) {
            int cur = n % 10;
            int toAdd = cur * mul;
            mul *= 10;
            n /= 10;
            if (toAdd == 0) continue;
            a.add(0,toAdd);
        }
        // System.out.println(a);
        return a.stream().mapToInt(i -> i).toArray();
    }
}
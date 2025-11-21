/*
 * Submission: 1831299718
 * Problem: Compute Decimal Representation (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-11-16 12:13:32 UTC
 * Runtime: 1 ms
 * Memory: 44.2 MB
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
            a.add(toAdd);
        }
        // System.out.println(a);
        int len = a.size(), idx = 0;
        int [] ans =new int[len];
        for (int i = len - 1; i >= 0; i--) {
            ans[idx++] = a.get(i);
        } return ans;
        // return a.stream().mapToInt(i -> i).toArray();
    }
}
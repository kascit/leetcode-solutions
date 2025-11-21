/*
 * Submission: 1747623866
 * Problem: Fizz Buzz (Easy)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-25 10:47:01 UTC
 * Runtime: 2 ms
 * Memory: 44.9 MB
 */

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0) {
                sb.append("Fizz");
            }
            if (i%5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() == 0) {
                sb.append(i);
            }
            ans.add(sb.toString());
            sb.setLength(0);
        } return ans;
    }
}
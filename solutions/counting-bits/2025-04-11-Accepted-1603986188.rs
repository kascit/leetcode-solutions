/*
 * Submission: 1603986188
 * Problem: Counting Bits (Easy)
 * Status: Accepted
 * Language: rust
 * Timestamp: 2025-04-11 20:01:39 UTC
 * Runtime: 0 ms
 * Memory: 2.6 MB
 */

impl Solution {
    fn count_bits(n: i32) -> Vec<i32> {
        let mut ans = vec![0; (n + 1) as usize];
        for i in 1..=n {
            ans[i as usize] = ans[(i >> 1) as usize] + (i & 1);
        }
        ans
    }
}
/*
 * Submission: 1710760206
 * Problem: Smallest Even Multiple (Easy)
 * Status: Accepted
 * Language: rust
 * Timestamp: 2025-07-25 09:04:07 UTC
 * Runtime: 0 ms
 * Memory: 2.1 MB
 */

impl Solution {
    pub fn smallest_even_multiple(n: i32) -> i32 {
        // if n & 1 == 1 {
        //     2 * n
        // } else {
        //     n
        // }

        n + (n & 1) * n
    }
}
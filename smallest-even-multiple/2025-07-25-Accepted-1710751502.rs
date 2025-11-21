/*
 * Submission: 1710751502
 * Problem: Smallest Even Multiple (Easy)
 * Status: Accepted
 * Language: rust
 * Timestamp: 2025-07-25 08:55:49 UTC
 * Runtime: 0 ms
 * Memory: 2.2 MB
 */

impl Solution {
    pub fn smallest_even_multiple(n: i32) -> i32 {
        if (n&1 == 1){
            return 2*n;
        } else {return n;}
    }
}
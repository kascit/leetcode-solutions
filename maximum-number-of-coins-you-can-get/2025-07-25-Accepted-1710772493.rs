/*
 * Submission: 1710772493
 * Problem: Maximum Number of Coins You Can Get (Medium)
 * Status: Accepted
 * Language: rust
 * Timestamp: 2025-07-25 09:15:49 UTC
 * Runtime: 8 ms
 * Memory: 3.4 MB
 */

impl Solution {
    pub fn max_coins(mut piles: Vec<i32>) -> i32 {
        piles.sort();
        piles.iter().skip(piles.len() / 3).step_by(2).sum()
    }
}

/*
 * Submission: 1710773698
 * Problem: Maximum Number of Coins You Can Get (Medium)
 * Status: Accepted
 * Language: rust
 * Timestamp: 2025-07-25 09:16:57 UTC
 * Runtime: 6 ms
 * Memory: 3.3 MB
 */

impl Solution {
    pub fn max_coins(mut piles: Vec<i32>) -> i32 {
        piles.sort_unstable();
        piles.iter().skip(piles.len() / 3).step_by(2).sum()
    }
}

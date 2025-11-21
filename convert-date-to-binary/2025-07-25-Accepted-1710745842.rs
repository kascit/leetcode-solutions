/*
 * Submission: 1710745842
 * Problem: Convert Date to Binary (Easy)
 * Status: Accepted
 * Language: rust
 * Timestamp: 2025-07-25 08:50:23 UTC
 * Runtime: 0 ms
 * Memory: 2.1 MB
 */

impl Solution {
    pub fn convert_date_to_binary(date: String) -> String {
        date.split("-").map(|s| s.parse::<i32>().unwrap()).map(|i| format!("{i:b}")).collect::<Vec<String>>().join("-")
    }
}
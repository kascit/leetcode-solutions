/*
 * Submission: 1710747051
 * Problem: Convert Date to Binary (Easy)
 * Status: Accepted
 * Language: rust
 * Timestamp: 2025-07-25 08:51:37 UTC
 * Runtime: 0 ms
 * Memory: 2.2 MB
 */

impl Solution {
    pub fn convert_date_to_binary(date: String) -> String {
        date.split("-")
            .map(|s| s.parse::<i16>().unwrap())
            .map(|i| format!("{i:b}"))
            .collect::<Vec<String>>()
            .join("-")
    }
}
/*
 * Submission: 1710746886
 * Problem: Convert Date to Binary (Easy)
 * Status: Compile Error
 * Language: rust
 * Timestamp: 2025-07-25 08:51:28 UTC
 * Runtime: N/A
 * Memory: N/A
 */

impl Solution {
    pub fn convert_date_to_binary(date: String) -> String {
        date.split("-")
            .map(|s| s.parse::<i16>().unwrap())
            .map(|i| format!("{i:b}"))
            .collect::<Vec<String>>()
            .join("-")
    }
}0
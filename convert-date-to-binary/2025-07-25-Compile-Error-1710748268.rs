/*
 * Submission: 1710748268
 * Problem: Convert Date to Binary (Easy)
 * Status: Compile Error
 * Language: rust
 * Timestamp: 2025-07-25 08:52:45 UTC
 * Runtime: N/A
 * Memory: N/A
 */

impl Solution {
    pub fn convert_date_to_binary(date: String) -> String {
        let v = date.split("-")
            .map(|s| s.parse::<i32>().unwrap());
            // .map(|i| format!("{i:b}"))
            // .collect::<Vec<String>>()
            // .join("-")
        
        format!("{:b}-{:b}-{:b}", v[0], v[1], v[2])
    }
}
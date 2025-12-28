/*
 * Submission: 1710748755
 * Problem: Convert Date to Binary (Easy)
 * Status: Accepted
 * Language: rust
 * Timestamp: 2025-07-25 08:53:11 UTC
 * Runtime: 0 ms
 * Memory: 2.1 MB
 */

impl Solution {
    pub fn convert_date_to_binary(date: String) -> String {
        let v = date.split("-")
            .map(|s| s.parse::<i32>().unwrap())
            .collect::<Vec<i32>>();
            // .map(|i| format!("{i:b}"))
            // .collect::<Vec<String>>()
            // .join("-")
        
        format!("{:b}-{:b}-{:b}", v[0], v[1], v[2])
    }
}